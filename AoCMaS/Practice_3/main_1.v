`timescale 1ns / 1ps

module sdnf (
    input wire [4:0] in,
    output wire f
);

assign f = (~in[4] && ~in[3] && ~in[2] && ~in[1] && in[0]) ||
           (~in[4] && ~in[3] && ~in[2] && in[1] && in[0]) ||
           (~in[4] && ~in[3] && in[2] && in[1] && ~in[0]) ||
           (~in[4] && in[3] && ~in[2] && in[1] && ~in[0]) ||
           (~in[4] && in[3] && in[2] && ~in[1] && in[0]) ||
           (~in[4] && in[3] && in[2] && in[1] && ~in[0]) ||
           (in[4] && ~in[3] && ~in[2] && in[1] && ~in[0]) ||
           (in[4] && ~in[3] && ~in[2] && in[1] && in[0]) ||
           (in[4] && ~in[3] && in[2] && ~in[1] && ~in[0]) ||
           (in[4] && ~in[3] && in[2] && ~in[1] && in[0]) ||
           (in[4] && ~in[3] && in[2] && in[1] && ~in[0]) ||
           (in[4] && in[3] && ~in[2] && ~in[1] && ~in[0]) ||
           (in[4] && in[3] && ~in[2] && ~in[1] && in[0]) ||
           (in[4] && in[3] && in[2] && ~in[1] && ~in[0]) ||
           (in[4] && in[3] && in[2] && ~in[1] && in[0]) ||
           (in[4] && in[3] && in[2] && in[1] && in[0]);
         //   1        2        3        4        5  
          
endmodule

module mdnf (
    input wire [4:0] in, 
    output wire f 
);

         //   1          2         3          4         5  
assign f = (in[4]  &&  in[3]            && ~in[1]) || 
           (in[4]            &&  in[2]  && ~in[1]) || 
           (in[4]  &&  in[3] &&  in[2]              && in[0]) ||
           (           in[3] &&  in[2]  && ~in[1]   && in[0]) ||
           (~in[4] &&  in[3]            &&  in[1]   && ~in[0]) || 
           (~in[4] && ~in[3] && ~in[2]              && in[0]) || 
           (in[4]  && ~in[3] && ~in[2]  && in[1]) ||
           (          ~in[3] &&  in[2]  &&  in[1]   && ~in[0]);
endmodule