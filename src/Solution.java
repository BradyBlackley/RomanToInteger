class Solution {
    public int romanToInt(String s) {
        int retVal = 0;

        for(int i = 0; i < s.length(); i++) {
            switch (s.charAt(i)) {
                case 'I' :
                    if(i+1 < s.length()) {
                        switch (s.charAt(i+1)) {
                            case 'V' : retVal += 4;
                                i+=1;
                                break;
                            case 'X' : retVal += 9;
                                i+=1;
                                break;
                            default : retVal += 1;
                                break;
                        }
                    } else {
                        retVal += 1;
                        break;
                    }
                    break;
                case 'V' : retVal += 5;
                    break;
                case 'X' :
                    if(i+1 < s.length()) {
                        switch (s.charAt(i+1)) {
                            case 'L' : retVal += 40;
                                i+=1;
                                break;
                            case 'C' : retVal += 90;
                                i+=1;
                                break;
                            default : retVal += 10;
                                break;
                        }
                    } else {
                        retVal += 10;
                        break;
                    }
                    break;
                case 'L' : retVal += 50;
                    break;
                case 'C' :
                    if(i+1 < s.length()) {
                        switch (s.charAt(i+1)) {
                            case 'D' : retVal += 400;
                                i+=1;
                                break;
                            case 'M' : retVal += 900;
                                i+=1;
                                break;
                            default : retVal += 100;
                                break;
                        }
                    } else {
                        retVal += 100;
                        break;
                    }
                    break;
                case 'D' : retVal += 500;
                    break;
                case 'M' : retVal +=  1000;
                    break;
            }
        }

        return retVal;
    }
}
