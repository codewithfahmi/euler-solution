<?php

$firstList = range(1, 999);
$secondList = range(999, 1, -1);
$resultList = [];

foreach ($firstList as $fst) {
  foreach ($secondList as $scnd) {
    $str = (string) $fst * $scnd;
    if ($str == strrev($str)) {
      $resultList[] = $str;
    }
  }
}

sort($resultList);
$result = max($resultList);
echo $result;