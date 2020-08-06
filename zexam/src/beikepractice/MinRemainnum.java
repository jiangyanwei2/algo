package beikepractice;

public class MinRemainnum {
    public String removeKdigits(String num, int k) {
        StringBuilder sb = new StringBuilder();
        //Long res = 0L;
        int index = -1;

        for (int i = k; i < num.length(); i++) {
            index = getMinIndex(num, index + 1, i);
            //res = res * 10 + (num.charAt(index) - '0');
            sb.append(num.charAt(index));
        }
        String res = sb.toString();
        if (res.startsWith("0")) {
            while (res.startsWith("0")) {
                res = res.substring(1);
            }
            return res;
        }
        return res;
    }


    public int getMinIndex(String s, int begin, int end) {
        if (begin > end) return -1;
        char min = s.charAt(begin);
        int minIndex = begin;
        for (int i = begin + 1; i <= end; i++) {
            if (s.charAt(i) < min) {
                min = s.charAt(i);
                minIndex = i;
            }
        }
        return minIndex;
    }

    public static void main(String[] args) {
        MinRemainnum minRemainnum = new MinRemainnum();
        String str = "9964143637881536115347130215819342018286368478941148499497648482711459533461004254405644237053081606083361703097681313409879305615510320200854934444651935440830730707105506511273844202022847156939479617415032308016122590196433883734152425324321850950025461922368309179936567772058238956815658522566619712309337787110000248140248621983725541138216249932119341652497227527347196915584874245747655643373728114771002178121013476532176128561227651191732455258556988215663509467036265356759614472865379500702323093381756610448863769645016608790510082369942579876359844432606935705284237991853585529691576005445931743352187877817181108107659316666309094802979311362685246271238811648377471342618391148123088439359424933182816550379826963424443077369303388270800024963285014879985932202469314657763554311465766241899886051752598919297325070163176559846505309761680481734434389501672456194786083611750491579701118513267425527823659774604213876847372305982594830156571943761073290766254549904295349986681374111000";
        int k = 100;
        System.out.println(minRemainnum.removeKdigits(str, k));
    }
}
