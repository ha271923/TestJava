package naXa777.service;

import java.util.Date;
import java.util.UUID;

interface AlertDAO {
    UUID addAlert(Date time);
    Date getAlert(UUID id);
}
