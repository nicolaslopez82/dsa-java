function calculateDiscountedPrice(price, discountPercentaje){
    const discount = (price * discountPercentaje) / 100;
    const priceWithDiscount = price - discount;
    return priceWithDiscount;
}

console.log(calculateDiscountedPrice(50000, 15));

const originalPrice = 50000;
const discountPercentaje = 15;
const finalPrice = calculateDiscountedPrice(originalPrice, discountPercentaje);

console.log('Original Price: ' + originalPrice);
console.log('Discount Percentaje: ' + discountPercentaje);
console.log('Final Price: ' + finalPrice);
