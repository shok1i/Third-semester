`timescale 1ns / 1ps
//////////////////////////////////////////////////////////////////////////////////
// Company: 
// Engineer: 
// 
// Create Date: 23.11.2023 16:30:36
// Design Name: 
// Module Name: multi
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

module multi #(width = 1)( // изначальный параметр типа 2 информационных и 1 управ. Вот 1 это управ.
    input [width - 1 : 0] a, // управ вход
    input [2**width - 1 : 0] x, // инф вход
    output f // выход
    );
assign f = a ? x[1] : x[0]; // устаналивает что выходное значение является тем значением, которое указано управ входом
endmodule
