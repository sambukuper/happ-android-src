.class public abstract Lay7;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"


# static fields
.field public static final a:Lox1;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, Lmq7;

    .line 2
    .line 3
    const/16 v1, 0x12

    .line 4
    .line 5
    invoke-direct {v0, v1}, Lmq7;-><init>(B)V

    .line 6
    .line 7
    .line 8
    new-instance v1, Lox1;

    .line 9
    .line 10
    const/4 v2, 0x0

    .line 11
    invoke-direct {v1, v0, v2}, Lox1;-><init>(Ldn2;B)V

    .line 12
    .line 13
    .line 14
    sput-object v1, Lay7;->a:Lox1;

    .line 15
    .line 16
    return-void
.end method

.method public static final a(Lkx4;Lx67;JJFFLzy0;Llp2;II)V
    .locals 10

    .line 1
    move-object/from16 v0, p9

    .line 2
    .line 3
    and-int/lit8 v1, p11, 0x1

    .line 4
    .line 5
    if-eqz v1, :cond_0

    .line 6
    .line 7
    sget-object p0, Lhx4;->X:Lhx4;

    .line 8
    .line 9
    :cond_0
    move-object v2, p0

    .line 10
    and-int/lit8 p0, p11, 0x2

    .line 11
    .line 12
    if-eqz p0, :cond_1

    .line 13
    .line 14
    sget-object p1, Lu70;->e:Lx03;

    .line 15
    .line 16
    :cond_1
    move-object v3, p1

    .line 17
    and-int/lit8 p0, p11, 0x8

    .line 18
    .line 19
    if-eqz p0, :cond_2

    .line 20
    .line 21
    invoke-static {p2, p3, v0}, Lkw0;->a(JLlp2;)J

    .line 22
    .line 23
    .line 24
    move-result-wide p0

    .line 25
    goto :goto_0

    .line 26
    :cond_2
    move-wide p0, p4

    .line 27
    :goto_0
    and-int/lit8 v1, p11, 0x10

    .line 28
    .line 29
    const/4 v4, 0x0

    .line 30
    if-eqz v1, :cond_3

    .line 31
    .line 32
    move v1, v4

    .line 33
    goto :goto_1

    .line 34
    :cond_3
    move/from16 v1, p6

    .line 35
    .line 36
    :goto_1
    and-int/lit8 v5, p11, 0x20

    .line 37
    .line 38
    if-eqz v5, :cond_4

    .line 39
    .line 40
    move v8, v4

    .line 41
    goto :goto_2

    .line 42
    :cond_4
    move/from16 v8, p7

    .line 43
    .line 44
    :goto_2
    sget-object v4, Lay7;->a:Lox1;

    .line 45
    .line 46
    invoke-virtual {v0, v4}, Llp2;->j(Lq06;)Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    move-result-object v5

    .line 50
    check-cast v5, Lkt1;

    .line 51
    .line 52
    iget v5, v5, Lkt1;->X:F

    .line 53
    .line 54
    add-float v6, v5, v1

    .line 55
    .line 56
    sget-object v1, Lj41;->a:Lox1;

    .line 57
    .line 58
    new-instance v5, Ldw0;

    .line 59
    .line 60
    invoke-direct {v5, p0, p1}, Ldw0;-><init>(J)V

    .line 61
    .line 62
    .line 63
    invoke-virtual {v1, v5}, Lox1;->a(Ljava/lang/Object;)Lt06;

    .line 64
    .line 65
    .line 66
    move-result-object p0

    .line 67
    new-instance p1, Lkt1;

    .line 68
    .line 69
    invoke-direct {p1, v6}, Lkt1;-><init>(F)V

    .line 70
    .line 71
    .line 72
    invoke-virtual {v4, p1}, Lox1;->a(Ljava/lang/Object;)Lt06;

    .line 73
    .line 74
    .line 75
    move-result-object p1

    .line 76
    filled-new-array {p0, p1}, [Lt06;

    .line 77
    .line 78
    .line 79
    move-result-object p0

    .line 80
    new-instance v1, Lzx7;

    .line 81
    .line 82
    const/4 v7, 0x0

    .line 83
    move-wide v4, p2

    .line 84
    move-object/from16 v9, p8

    .line 85
    .line 86
    invoke-direct/range {v1 .. v9}, Lzx7;-><init>(Lkx4;Lx67;JFLd70;FLzy0;)V

    .line 87
    .line 88
    .line 89
    const p1, 0x1923bae6

    .line 90
    .line 91
    .line 92
    invoke-static {p1, v1, v0}, Ljm4;->U(ILon2;Llp2;)Lzy0;

    .line 93
    .line 94
    .line 95
    move-result-object p1

    .line 96
    const/16 p2, 0x38

    .line 97
    .line 98
    invoke-static {p0, p1, v0, p2}, Lmb6;->b([Lt06;Lrn2;Llp2;I)V

    .line 99
    .line 100
    .line 101
    return-void
.end method
