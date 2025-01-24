INSERT INTO product (
    sku, name_title, description, list_price, sale_price, category, category_tree,
    average_product_rating, product_url, product_image_urls, brand, total_number_reviews, reviews
) VALUES
(
    'SKU12345', 'Sample Product 1', 'This is a description for product 1.',
    100.00, 90.00, 'Electronics', 'Electronics > Gadgets', '4.5',
    'http://example.com/product1',
    'http://example.com/image1,http://example.com/image2',
    'BrandA', 100, 'Excellent product!'
),
(
    'SKU67890', 'Sample Product 2', 'This is a description for product 2.',
    150.00, 120.00, 'Home Appliances', 'Home Appliances > Kitchen', '4.7',
    'http://example.com/product2',
    'http://example.com/image3,http://example.com/image4',
    'BrandB', 200, 'Highly recommended!'
),
(
    'SKU54321', 'Sample Product 3', 'This is a description for product 3.',
    200.00, 180.00, 'Fashion', 'Fashion > Clothing', '4.2',
    'http://example.com/product3',
    'http://example.com/image5,http://example.com/image6',
    'BrandC', 50, 'Good quality but expensive.'
);
