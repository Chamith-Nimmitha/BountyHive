CREATE SCHEMA `BountyHive`;
CREATE TABLE `BountyHive`.`All_Campaigns`(
    `Campaign_Name` VARCHAR(30) NOT NULL,
    `Fb_Link` VARCHAR(200) NOT NULL,
    `Twitter_Link` VARCHAR(200) NOT NULL,
    `Telegram_Link` VARCHAR(200) NOT NULL,
    `Start_Date` DATE NOT NULL,
    `End_Date` DATE NOT NULL,
    `Recommend_Fb` INT(2) NOT NULL,
    `Recommend_Twitter` INT(2) NOT NULL,
    `Recommend_Telegram` INT(2) NOT NULL,
    `Complete_Fb` INT(2) NOT NULL,
    `Complete_TWitter` INT(2) NOT NULL,
    `Complete_Telegram` INT(2) NOT NULL,
    `Weel_No` INT(1) NOT NULL,
    PRIMARY KEY(INDEX)
    )
