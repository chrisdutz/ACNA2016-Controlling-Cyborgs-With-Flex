package de.codecentric.iot.rapiro.movement;

import de.codecentric.iot.rapiro.movement.model.MovementState;
import org.springframework.flex.remoting.RemotingDestination;
import org.springframework.stereotype.Service;

@Service("movementService")
@RemotingDestination
public class MovementService  {

    private MovementState movementState;

    public void stop() {
        // Do something
    }

    public void moveForward() {
        // Do something
    }

    // A lot more ...

    public MovementState getMovementState() {
        return movementState;
    }

}
