let isProductNameSameCheck = false;

$("#btnSave").click(() => {
	save();
});

$("#btnproductNameSameCheck").click(() => {
	checkProductName();
});

function save() {
	if (isProductNameSameCheck == false) {
		alert("상품명 중복 체크를 진행해주세요");
		return;
	}

	let data = {
		productName: $("#productName").val(),
		productPrice: $("#productPrice").val(),
		productQty: $("#productQty").val()
	};

	$.ajax("/product/add" , {
		type: "POST",
		dataType: "json", 
		data: JSON.stringify(data), 
		headers: { 
			"Content-Type": "application/json"
		}
	}).done((res) => {
		if (res.code == 1) {
			location.href = "/";
		} else {
			alert("중복체크를 다시 확인해주세요");
			history.back();
		}
	});
}

function checkProductName() {
	let productName = $("#productName").val();

	$.ajax(`/product/productNameSameCheck?productName=${productName}`, {
		type: "GET",
		dataType: "json",
		async: true
	}).done((res) => {
		if (res.code == 1) { // 통신 성공
			if (res.data == false) {
				alert("상품명이 중복되지 않았습니다.");
				isProductNameSameCheck = true;
			} else {
				alert("상품명이 중복되었습니다. 다른 상품명을 사용해주세요.");
				isProductNameSameCheck = false;
			}
		}
	});
}