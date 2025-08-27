WITH onkyo_device_type AS (SELECT id FROM device_type WHERE name = 'Onkyo')
INSERT
INTO command (device_type_id, cmd, cmd_comment)
SELECT id, cmd, cmd_comment
FROM onkyo_device_type,
     (VALUES ('PWR00', 'sets System Standby'),
             ('PWR01', 'sets System On')) AS cmds(cmd, cmd_comment);
