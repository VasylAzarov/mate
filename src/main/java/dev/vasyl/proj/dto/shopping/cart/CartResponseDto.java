package dev.vasyl.proj.dto.shopping.cart;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import org.springframework.data.domain.Page;

@Data
public class CartResponseDto {
    @Schema(description = "Shopping cart id",
            example = "1")
    private Long id;
    @Schema(description = "User id",
            example = "1")
    private Long userId;
    @Schema(description = "Page of cart Items")
    private Page<CartItemResponseDto> cartItems;
}
