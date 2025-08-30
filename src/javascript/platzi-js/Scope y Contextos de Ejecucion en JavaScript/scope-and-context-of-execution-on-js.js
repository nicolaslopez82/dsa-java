const productName = "laptop";
const price = 899;
const brand = "techCode";

function getProductInfo() {
    const productName = "smartphone";
    const price = 499;
    return `${productName} costs ${price} and is of brand ${brand}`;
}

console.log(getProductInfo());