 while((siguiente_movimientoI <= 6) && (siguiente_movimientoJ <= 6)){
            tablero[siguiente_movimientoI+1][siguiente_movimientoJ+1] = MOVIMIENTO;
            siguiente_movimientoJ = siguiente_movimientoJ +1;
            siguiente_movimientoI = siguiente_movimientoI +1;
        }