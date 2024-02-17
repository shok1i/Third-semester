`timescale 1ns / 1ps
//////////////////////////////////////////////////////////////////////////////////
// Company: 
// Engineer: 
// 
// Create Date: 23.11.2023 16:44:54
// Design Name: 
// Module Name: sefri
// Project Name: 
// Target Devices: 
// Tool Versions: 
// Description: 
// 
// Dependencies: 
// 
// Revision:
// Revision 0.01 - File Created
// Additional Comments:
// 
//////////////////////////////////////////////////////////////////////////////////
`timescale 1ns / 1ps

module sefri #(width = 2)(
    input [2 ** (width) - 1 : 0] a, // входные потры которых многа
    output reg [width - 1 : 0] Y, // кстати можно сразу выход в регистры кинуть, удобно
    output Q // считай общий выход
    );
    
integer i;

always @(a)
begin
    Y = 0;
    for(i = 0; i <= 2 ** (width) - 1; i = i + 1)
        if(a[i])
        begin
            Y = i;
        end
end
// ћаги€ тут така€. ѕровер€ем входные элементы, если один из них истина, то
// устанавливаем регистр f в значение i. —читай перебираем числа: 1,2,3,4,5 и т.д.
// но в двоичном формате. ¬идим совпадение - f становитс€ двоичным кодом этого числа
assign Q = a == 0; // ну а здесь просто ультимативный вывод этого чуда

endmodule
