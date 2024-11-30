const ProductList = ({ products }) => {
  return (
    <div className="row">
      {products.map((products) => (
        <div className="col-lg-4 c0l-md-6 col-sm-12 mb-4" key={products.id}>
          <div className="card h-100">
            <img
              src={products.imageUrl || "https:/placehold.co/600x400"}
              className="card-img-top"
              alt={products.name}
            />
            <div class="card-body">
              <h5 className="card-title">{products.name}</h5>
              <p className="card-text">{products.description}</p>
              <p className="card-text">
                <strong>${products.price}</strong>
              </p>
            </div>
          </div>
        </div>
      ))}
    </div>
  );
};

export default ProductList;
