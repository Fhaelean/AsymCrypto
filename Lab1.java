package com.company;

import java.io.*;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;


public class Main {

    public static void main(String[] args)
    {
        //a = 0.01
        double z01 = 0.83891293878626816;
        //a = 0.05
        double z05 = 0.82894388796634644;
        //a = 0.1
        double z1 = 0.81593990850046572;

        test1(BytestoInt(Standart()), z01);
        test1(BytestoInt(Standart()), z05);
        test1(BytestoInt(Standart()), z1);
        System.out.println();
        test1(BytestoInt(LehmerLow()), z01);
        test1(BytestoInt(LehmerLow()), z05);
        test1(BytestoInt(LehmerLow()), z1);
        System.out.println();
        test1(BytestoInt(LehmerHigh()), z01);
        test1(BytestoInt(LehmerHigh()), z05);
        test1(BytestoInt(LehmerHigh()), z1);
        System.out.println();
        test1(BitstoInt(L20()), z01);
        test1(BitstoInt(L20()), z05);
        test1(BitstoInt(L20()), z1);
        System.out.println();
        test1(BitstoInt(L89()), z01);
        test1(BitstoInt(L89()), z05);
        test1(BitstoInt(L89()), z1);
        System.out.println();
        test1(BitstoInt(Geffe()), z01);
        test1(BitstoInt(Geffe()), z05);
        test1(BitstoInt(Geffe()), z1);
        System.out.println();
        test1(BytestoInt(Bibliotech()), z01);
        test1(BytestoInt(Bibliotech()), z05);
        test1(BytestoInt(Bibliotech()), z1);
        System.out.println();
        test1(BytestoInt(Volfram()), z01);
        test1(BytestoInt(Volfram()), z05);
        test1(BytestoInt(Volfram()), z1);
        System.out.println();
        test1(BitstoInt(BM()), z01);
        test1(BitstoInt(BM()), z05);
        test1(BitstoInt(BM()), z1);
        System.out.println();
        test1(BytestoInt(BMbytes()), z01);
        test1(BytestoInt(BMbytes()), z05);
        test1(BytestoInt(BMbytes()), z1);
        System.out.println();
        test1(BitstoInt(BBS()), z01);
        test1(BitstoInt(BBS()), z05);
        test1(BitstoInt(BBS()), z1);
        System.out.println();
        test1(BytestoInt(BBSbytes()), z01);
        test1(BytestoInt(BBSbytes()), z05);
        test1(BytestoInt(BBSbytes()), z1);

        test2(BytestoInt(Standart()), z01);
        test2(BytestoInt(Standart()), z05);
        test2(BytestoInt(Standart()), z1);
        System.out.println();
        test2(BytestoInt(LehmerLow()), z01);
        test2(BytestoInt(LehmerLow()), z05);
        test2(BytestoInt(LehmerLow()), z1);
        System.out.println();
        test2(BytestoInt(LehmerHigh()), z01);
        test2(BytestoInt(LehmerHigh()), z05);
        test2(BytestoInt(LehmerHigh()), z1);
        System.out.println();
        test2(BitstoInt(L20()), z01);
        test2(BitstoInt(L20()), z05);
        test2(BitstoInt(L20()), z1);
        System.out.println();
        test2(BitstoInt(L89()), z01);
        test2(BitstoInt(L89()), z05);
        test2(BitstoInt(L89()), z1);
        System.out.println();
        test2(BitstoInt(Geffe()), z01);
        test2(BitstoInt(Geffe()), z05);
        test2(BitstoInt(Geffe()), z1);
        System.out.println();
        test2(BytestoInt(Bibliotech()), z01);
        test2(BytestoInt(Bibliotech()), z05);
        test2(BytestoInt(Bibliotech()), z1);
        System.out.println();
        test2(BytestoInt(Volfram()), z01);
        test2(BytestoInt(Volfram()), z05);
        test2(BytestoInt(Volfram()), z1);
        System.out.println();
        test2(BitstoInt(BM()), z01);
        test2(BitstoInt(BM()), z05);
        test2(BitstoInt(BM()), z1);
        System.out.println();
        test2(BytestoInt(BMbytes()), z01);
        test2(BytestoInt(BMbytes()), z05);
        test2(BytestoInt(BMbytes()), z1);
        System.out.println();
        test2(BitstoInt(BBS()), z01);
        test2(BitstoInt(BBS()), z05);
        test2(BitstoInt(BBS()), z1);
        System.out.println();
        test2(BytestoInt(BBSbytes()), z01);
        test2(BytestoInt(BBSbytes()), z05);
        test2(BytestoInt(BBSbytes()), z1);

        test3(BytestoInt(Standart()), z01);
        test3(BytestoInt(Standart()), z05);
        test3(BytestoInt(Standart()), z1);
        System.out.println();
        test3(BytestoInt(LehmerLow()), z01);
        test3(BytestoInt(LehmerLow()), z05);
        test3(BytestoInt(LehmerLow()), z1);
        System.out.println();
        test3(BytestoInt(LehmerHigh()), z01);
        test3(BytestoInt(LehmerHigh()), z05);
        test3(BytestoInt(LehmerHigh()), z1);
        System.out.println();
        test3(BitstoInt(L20()), z01);
        test3(BitstoInt(L20()), z05);
        test3(BitstoInt(L20()), z1);
        System.out.println();
        test3(BitstoInt(L89()), z01);
        test3(BitstoInt(L89()), z05);
        test3(BitstoInt(L89()), z1);
        System.out.println();
        test3(BitstoInt(Geffe()), z01);
        test3(BitstoInt(Geffe()), z05);
        test3(BitstoInt(Geffe()), z1);
        System.out.println();
        test3(BytestoInt(Bibliotech()), z01);
        test3(BytestoInt(Bibliotech()), z05);
        test3(BytestoInt(Bibliotech()), z1);
        System.out.println();
        test3(BytestoInt(Volfram()), z01);
        test3(BytestoInt(Volfram()), z05);
        test3(BytestoInt(Volfram()), z1);
        System.out.println();
        test3(BitstoInt(BM()), z01);
        test3(BitstoInt(BM()), z05);
        test3(BitstoInt(BM()), z1);
        System.out.println();
        test3(BytestoInt(BMbytes()), z01);
        test3(BytestoInt(BMbytes()), z05);
        test3(BytestoInt(BMbytes()), z1);
        System.out.println();
        test3(BitstoInt(BBS()), z01);
        test3(BitstoInt(BBS()), z05);
        test3(BitstoInt(BBS()), z1);
        System.out.println();
        test3(BytestoInt(BBSbytes()), z01);
        test3(BytestoInt(BBSbytes()), z05);
        test3(BytestoInt(BBSbytes()), z1);
    }
    public static int[] BitstoInt(int arr[])
    {
        String s1 = "";
        int[] massres = new int[arr.length / 8];
        int cc = 0;
        for(int i = 0; i < arr.length; i = i + 8)
        {
            s1 = "" + arr[i] + arr[i + 1] + arr[i + 2] + arr[i + 3] + arr[i + 4] + arr[i + 5] + arr[i + 6] + arr[i + 7];
            massres[cc] = Integer.parseInt(s1, 2);
            cc++;
        }
        return massres;
    }

    public static int[] BytestoInt(int arr[])
    {
        int[] massres = new int[arr.length];
        Byte b = 0;
        for(int i = 0; i < arr.length; i++)
        {
            b = (byte)arr[i];
            massres[i] = b & 0xFF;
        }
        return massres;
    }

    public static void test1(int arr[], double z)
    {
        int[] res = new int[256];
        double xi1 = 0;
        double xi2 = 0;
        int v = 0;
        int n = arr.length / 256;
        int l = 255;
        for (int i = 0; i < arr.length; i++)
            res[arr[i]]++;

        for(int i = 0; i < 256; i++)
        {
            v = res[i];
            xi2 += Math.pow((v - n), 2) / n;
        }
        xi1 = Math.sqrt(2 * l) * z + l;
        if(xi2 <= xi1)
        {
            System.out.print("X^2 = " + xi2 + "  ");
            System.out.print("X1-a^2 = " + xi1 + " Uniform");
            System.out.println();
        }
        else
        {
            System.out.print("X^2 = " + xi2 + "  ");
            System.out.print("X1-a^2 = " + xi1 + " NOT uniform");
            System.out.println();
        }
    }
    public static void test2(int arr[], double z)
    {

        int[][] vij1 = new int[256][256];
        int [] vi1 = new int [256];
        int [] aj1 = new int [256];

        for (int i = 0; i < arr.length; i=i+2)
            vij1[arr[i]][arr[i+1]]++;
        for (int i = 0; i < arr.length; i=i+2)
            vi1[arr[i]]++;
        for (int i = 1; i < arr.length; i=i+2)
            aj1[arr[i]]++;
        double ff = 0;
        int n = (arr.length)/2;
        double  xi2 = 0;
        for(int i = 0; i < 256; i++)
        {
            for (int j = 0; j < 256; j++)
            {
                int vij = vij1[i][j];
                int vi = vi1[i];
                int aj = aj1[j];
                if(vi == 0){continue;}
                if(aj == 0){continue;}
                ff += Math.pow(vij, 2) / (vi * aj);
            }
        }
        double mm;
        mm = n*(ff-1);
        xi2 = (long)mm;
        double l = Math.pow(255, 2);
        double xil = Math.sqrt(2 * l) * z + l;

        if (xi2 <= xil) {
            System.out.print("X^2 = " + xi2 + "  ");
            System.out.print("X1-a^2 = " + xil + " Independent");
            System.out.println();
        } else {
            System.out.print("X^2 = " + xi2 + "  ");
            System.out.print("X1-a^2 = " + xil + " Dependent");
            System.out.println();
        }

    }
    public static void test3(int arr[], double z)
    {
        int[] res = new int[256];
        int[][] resseg = new int[20][256];
        double xi1, xi2 = 0;
        int n = arr.length;
        int r = 20;
        int m = n / r;
        int l = 255 * (r - 1);
        double vij, vi = 0;
        int aj = m;
        double sumxi2 = 0;
        double pow = 0;
        double viaj = 0;
        for (int i = 0, j = 0; i < arr.length; i++)
        {
            res[arr[i]]++;
            if(i != 0)
                if(i % m == 0)
                    j++;
            resseg[j][arr[i]]++;
        }

        for (int i = 0; i < r; i++)
        {
            for (int j = 0; j < 256; j++)
            {
                vij = resseg[i][j];
                vi = res[j];
                if (vi == 0) { continue; }
                if (aj == 0) { continue; }
                pow = Math.pow(vij, 2 );
                viaj = vi * aj;
                sumxi2 += pow / viaj;
            }
        }
        xi2 = n * (sumxi2 - 1);
        xi1 = Math.sqrt(2 * l) * z + l;
        if(xi2 <= xi1)
        {
            System.out.print("X^2 = " + xi2 + "  ");
            System.out.print("X1-a^2 = " + xi1 + " Homogeneous");
            System.out.println();
        }
        else
        {
            System.out.print("X^2 = " + xi2 + "  ");
            System.out.print("X1-a^2 = " + xi1 + " NOT homogeneous");
            System.out.println();
        }
    }


    public static void showres(int arr[])
    {
        for(int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");
    }

    static int[] Standart()
    {
        int[] rand = new int[1000000];
        for (int i = 0; i < rand.length; i++)
            rand[i] = (int) (Math.random() * (0 + rand.length));
        return rand;
    }
    static int[] LehmerLow()
    {
        long a = (long) (Math.pow(2, 16) + 1);
        long c = 119;
        long m = (long) (Math.pow(2, 32));
        long x = ThreadLocalRandom.current().nextInt(1, 100 + 1);

        int[] mass = new int[1000000];
        for (int i = 0; i < mass.length; i++)
        {
            mass[i] = (int)(x & 0xFF);//& 0xFF
            x = (a * x + c) % m;
        }
        return mass;
    }
    static int[] LehmerHigh()
    {
        long a1 = (long) (Math.pow(2, 16) + 1);
        long c1 = 119;
        long m1 = (long) (Math.pow(2, 32));
        long x1 = ThreadLocalRandom.current().nextInt(1, 100 + 1);
        int[] mass1 = new int[1000000];
        for (int i = 0; i < mass1.length; i++)
        {
            mass1[i] = (int)(x1 >>> 24);//>>>8
            x1 = (a1 * x1 + c1) % m1;
        }
        return mass1;
    }
    static int[] L20()
    {
        int[] L20 = new int[8000000];//1048575
        for (int i = 0; i < 20; i++)
            L20[i] = (int)(Math.random() * 2);
        for (int i = 0; i < (L20.length - 20); i++)
            L20[20 + i] = (L20[i] ^ L20[i + 11] ^ L20[i + 15] ^ L20[i + 17]);
        return L20;
    }
    static int[] L89()
    {
        int[] L89 = new int[8000000];
        for (int i = 0; i < 89; i++)
            L89[i] = (int)(Math.random() * 2);
        for (int i = 0; i < (L89.length - 89); i++)
            L89[89 + i] = (L89[i] ^ L89[i + 51]);
        return L89;
    }
    static int[] Geffe()
    {
        int[] L1 = new int[11];
        int[] L2 = new int[9];
        int[] L3 = new int[10];
        for (int i = 0; i < L1.length; i++)
            L1[i] = (int)(Math.random() * 2);
        for (int i = 0; i < L2.length; i++)
            L2[i] = (int)(Math.random() * 2);
        for (int i = 0; i < L3.length; i++)
            L3[i] = (int)(Math.random() * 2);
        int[] Xi = new int[2047];
        int[] Yi = new int[511];
        int[] Si = new int[1023];
        int[] Geffe = new int[8000000];
        int res = 0;
        for (int i = 0; i < Xi.length; i++) {
            Xi[i] = L1[0];
            res = (L1[0] ^ L1[2]);
            for (int j = 1; j < L1.length; j++)
                L1[j - 1] = L1[j];
            L1[10] = res;
        }
        for (int i = 0; i < Yi.length; i++) {
            Yi[i] = L2[0];
            res = (L2[0] ^ L2[1] ^ L2[3] ^ L2[4]);
            for (int j = 1; j < L2.length; j++)
                L2[j - 1] = L2[j];
            L2[8] = res;
        }
        for (int i = 0; i < Si.length; i++) {
            Si[i] = L3[0];
            res = (L3[0] ^ L3[3]);
            for (int j = 1; j < L3.length; j++)
                L3[j - 1] = L3[j];
            L3[9] = res;
        }
        int i1 = 0;
        int i2 = 0;
        int i3 = 0;
        for (int i = 0; i < Geffe.length; i++) {
            if (i1 == Xi.length)
                i1 = 0;
            if (i2 == Yi.length)
                i2 = 0;
            if (i3 == Si.length)
                i3 = 0;
            Geffe[i] = ((Si[i3] * Xi[i1]) ^ (1 ^ Si[i3]) * Yi[i2]);
            i1++;
            i2++;
            i3++;
        }
        return Geffe;
    }
    static int[] Bibliotech()
    {
        int[] text = new int [1000000];
        int counter = 0;
        try (FileReader reader = new FileReader("/Users/Fhaelean/IdeaProjects/Lab_1_ascrypt/Text.txt"))
        {
            int cc;
            while ((cc = reader.read()) != -1)
            {
                if(counter == text.length)
                    break;
                text[counter++] = cc;
            }
        }
        catch (IOException ex)
        {
            System.out.println(ex.getMessage());
        }
        return text;
    }
    static int[] Volfram()
    {
        int[] volf = new int[1000000];
        int min = 1000000;
        int max = 1294967295;
        Random rnd = new Random(System.currentTimeMillis());
        int randnum = min + rnd.nextInt(max - min + 1);
        int ra = 0;
        int ra1 = 0;
        for (int i = 0; i < volf.length; i++)
        {
            volf[i] = (int)(randnum % Math.pow(2,32));
            //volf[i] = randnum % 2;
            ///////             >>>>
            String xsd2 = Integer.toBinaryString(randnum);
            String shiftedx2 = xsd2.substring(xsd2.length() - 1) + xsd2.substring(0, xsd2.length()-1);
            ra1 = Integer.parseInt(shiftedx2, 2);
            ///////             <<<<
            String xsd22 = Integer.toBinaryString(randnum);
            String shiftedx22 = xsd22.substring(1, xsd22.length()) + xsd22.substring(0,1);
            ra = Integer.parseInt(shiftedx22, 2);
            /////
            int it2 = 0, temp2[] = new int[64];
            int binary2[];
            while (randnum > 0)
            {
                temp2[it2++] = randnum % 2;
                randnum /= 2;
            }
            binary2 = new int[64];
            int iter2 = 0;
            for (int j = 63; j >= 0; j--)
                binary2[j] = temp2[iter2++];
            ///randnum
            int it = 0, temp[] = new int[64];
            int binary[];
            while (ra > 0)
            {
                temp[it++] = ra % 2;
                ra /= 2;
            }
            binary = new int[64];
            int iter = 0;
            for (int j = 63; j >= 0; j--)
                binary[j] = temp[iter++];
            ///randnum << 1
            int it1 = 0, temp1[] = new int[64];
            int binary1[];
            while (ra1 > 0)
            {
                temp1[it1++] = ra1 % 2;
                ra1 /= 2;
            }
            binary1 = new int[64];
            int iter1 = 0;
            for (int j = 63; j >= 0; j--)
                binary1[j] = temp1[iter1++];
            ///randnum >>> 1
            String stringa = "";
            int[] resv = new int[64];
            int dv = 0;
            for(int ii = 0; ii < 64; ii++)
            {
                resv[ii] = ((binary[ii]) ^ (binary2[ii] | binary1[ii]));
                stringa = stringa + resv[ii];
            }
            dv = Integer.parseInt(stringa, 2);
            randnum = dv;
        }
        return volf;
    }
    static int[] BM()
    {
        final Random rand1 = new Random();
        int[] BM = new int[1000000];
        String str = "CEA42B987C44FA642D80AD9F51F10457690DEF10C83D0BC1BCEE12FC3B6093E3";
        String str2 = "5B88C41246790891C095E2878880342E88C79974303BD0400B090FE38A688356";
        BigInteger p = new BigInteger(str, 16);
        BigInteger a2 = new BigInteger(str2, 16);
        BigInteger q = p.subtract(BigInteger.valueOf(1));
        BigInteger c2 = q.divide(BigInteger.valueOf(2));
        BigInteger t2 = a2;
        do {
            t2 = new BigInteger(t2.bitLength(), rand1);
        } while (t2.compareTo(p) >= 0);
        int result = 0;
        for(int i = 0; i < BM.length;i++)
        {
            result = t2.compareTo(c2);
            if(result >= 0)
                BM[i] = 0;
            else
                BM[i] = 1;
            t2 = a2.modPow(t2, p);
        }
        return BM;
    }
    static int[] BMbytes()
    {
        final Random rand3 = new Random();
        int[] BM_bytes = new int[1000000];
        String str3 = "CEA42B987C44FA642D80AD9F51F10457690DEF10C83D0BC1BCEE12FC3B6093E3";
        String str4 = "5B88C41246790891C095E2878880342E88C79974303BD0400B090FE38A688356";
        BigInteger p3 = new BigInteger(str3, 16);
        BigInteger a3 = new BigInteger(str4, 16);
        BigInteger q3 = p3.subtract(BigInteger.valueOf(1)); //p-1
        BigInteger t3 = a3;
        BigInteger result33 ;
        BigInteger result44 ;
        do {
            t3 = new BigInteger(t3.bitLength(), rand3);
        } while (t3.compareTo(p3) >= 0);
        int result3;
        int resultx3;
        for (int i = 0 ; i < BM_bytes.length;i++)
        {
            for (int k = 0 ; k < 256; k++)
            {
                int k1 = k + 1;
                result33 = q3.multiply(BigInteger.valueOf(k));
                result44 = q3.multiply(BigInteger.valueOf(k1));
                BigInteger c11 = result33.divide(BigInteger.valueOf(256));
                BigInteger c22 = result44.divide(BigInteger.valueOf(256));
                result3 = c11.compareTo(t3);
                resultx3 = t3.compareTo(c22);
                if (result3 == -1 && (resultx3 == -1 || resultx3 == 0))
                {
                    BM_bytes[i] = k;
                    break;
                }
            }
            t3 = a3.modPow(t3, p3);
        }
        return BM_bytes;
    }
    static int[] BBS()
    {
        final Random rand2 = new Random();
        int [] BBS = new int[8000000];

        String str1 = "D5BBB96D30086EC484EBA3D7F9CAEB07";
        String str21 = "425D2B9BFDB25B9CF6C416CC6E37B59C1F";
        BigInteger p1 = new BigInteger(str1, 16);
        BigInteger q1 = new BigInteger(str21, 16);
        BigInteger n1 = q1.multiply(p1);
        BigInteger r1 = p1;
        BigInteger step1 = BigInteger.valueOf(2);
        BigInteger xx1 ;
        do {
            r1 = new BigInteger(r1.bitLength(), rand2);
        } while (r1.compareTo(p1) >= 0);

        for (int i = 0 ; i < BBS.length;i++)
        {
            r1 = r1.modPow(step1,n1);
            xx1 = r1.mod(step1);
            BBS[i] = xx1.intValue();
        }
        return BBS;
    }
    static int[] BBSbytes()
    {
        final Random rand5 = new Random();
        int[] BBS_bytes = new int[1000000];
        String strbit = "D5BBB96D30086EC484EBA3D7F9CAEB07";
        String str2bit = "425D2B9BFDB25B9CF6C416CC6E37B59C1F";
        BigInteger pbit = new BigInteger(strbit, 16);
        BigInteger qbit = new BigInteger(str2bit, 16);
        BigInteger nbit = qbit.multiply(pbit);
        BigInteger rbit = pbit;
        BigInteger stepbit = BigInteger.valueOf(2);
        BigInteger step256bit = BigInteger.valueOf(256);
        BigInteger xbit ;
        do {
            rbit = new BigInteger(rbit.bitLength(), rand5);
        } while (rbit.compareTo(pbit) >= 0);

        for (int i = 0 ; i < BBS_bytes.length;i++)
        {
            rbit = rbit.modPow(stepbit,nbit);
            xbit = rbit.mod(step256bit);
            BBS_bytes[i]= xbit.intValue();
        }
        return BBS_bytes;
    }
}
