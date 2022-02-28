package webshop;

import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;

public class ProductRepository {

    private JdbcTemplate jdbcTemplate;

    public ProductRepository(DataSource dataSource) {
        jdbcTemplate = new JdbcTemplate(dataSource);
    }


    public long insertProduct(String productName, int price, int stock) {
        return 1;
    }

    public Product findProductById(long id) {
        return jdbcTemplate.queryForObject("Select * from products where id = ?", (rs, rowNum)
                -> new Product(rs.getLong("id"), rs.getString("product_name")
                , rs.getInt("price"), rs.getInt("stock")), id);

    }

    public void updateProductStock(long id, int amount) {
        System.out.println();
    }


}
