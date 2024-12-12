package dev.vasyl.proj.dto.shopping.cart;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;

public record UpdateCartItemRequestDto(
        @Schema(description = "Operation increase quantity or decrease quantity",
                example = "INCREASE")
        @NotNull
        CartItemOperation operation,
        @Schema(description = "quantity",
                example = "3")
        @Min(0)
        int quantity) {
}