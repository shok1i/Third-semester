`timescale 1ns / 1ps

module funSefri(
    input a,b,c,d,e,
    output f
    );
    
wire [31:0] w0;
wire q;

deshi#(5) dc0(.Active({1}),.a({a,b,c,d,e}),.f(w0));
sefri#(1) 
sf0(.a({(
w0[1] |
w0[5] |
w0[6] |
w0[8] |
w0[9] |
w0[11] |
w0[13] |
w0[14] |
w0[16] |
w0[19] |
w0[22] |
w0[24] |
w0[25] |
w0[26] |
w0[27] |
w0[30] |
w0[31]
), (
w0[0] |
w0[2] |
w0[3] |
w0[4] |
w0[7] |
w0[10] |
w0[12] |
w0[15] |
w0[17] |
w0[18] |
w0[20] |
w0[21] |
w0[23] |
w0[28] |
w0[29]
)}),.Y(f), .Q(q));
endmodule
