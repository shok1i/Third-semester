`timescale 1ns / 1ps
//////////////////////////////////////////////////////////////////////////////////
// Company: 
// Engineer: 
// 
// Create Date: 23.11.2023 16:36:18
// Design Name: 
// Module Name: deshi
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

module deshi #(width = 2)(
    input Active, // разрешающий вход
    input [width - 1 : 0] a, // вход для подчи сигнала
    output [2**(width) - 1: 0] f // выходные сигналы
    );
    
reg [2**(width) - 1 : 0] r;

always @*
begin
    if(!Active)
        r = 0;
    else 
        r = 1 << a;
end
// когда включен дешик мы записываем в регистр значения, которые образуются на дешике. Это будет выглядеть как
// 000000010 или 0001000000, короче 1 будет только одна
assign f = r; // передаем регистр на выход и т.к. они одного размера клеятся прекрасно
endmodule
