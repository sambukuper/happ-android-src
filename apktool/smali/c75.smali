.class public Lc75;
.super Llj7;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"


# static fields
.field public static final f0:Lc75;

.field public static final g0:Lc75;


# instance fields
.field public final synthetic Z:B


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lc75;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Lc75;-><init>(B)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lc75;->f0:Lc75;

    .line 8
    .line 9
    new-instance v0, Lc75;

    .line 10
    .line 11
    const/4 v1, 0x1

    .line 12
    invoke-direct {v0, v1}, Lc75;-><init>(B)V

    .line 13
    .line 14
    .line 15
    sput-object v0, Lc75;->g0:Lc75;

    .line 16
    .line 17
    return-void
.end method

.method public constructor <init>(B)V
    .locals 1

    .line 1
    iput-byte p1, p0, Lc75;->Z:B

    .line 2
    .line 3
    packed-switch p1, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    :pswitch_0
    const-class p1, Ljava/lang/Object;

    .line 7
    .line 8
    invoke-direct {p0, p1}, Llj7;-><init>(Ljava/lang/Class;)V

    .line 9
    .line 10
    .line 11
    return-void

    .line 12
    :pswitch_1
    const-class p1, Ljava/lang/String;

    .line 13
    .line 14
    const/4 v0, 0x0

    .line 15
    invoke-direct {p0, v0, p1}, Llj7;-><init>(ILjava/lang/Class;)V

    .line 16
    .line 17
    .line 18
    return-void

    .line 19
    :pswitch_2
    const-class p1, [C

    .line 20
    .line 21
    invoke-direct {p0, p1}, Llj7;-><init>(Ljava/lang/Class;)V

    .line 22
    .line 23
    .line 24
    return-void

    .line 25
    :pswitch_3
    const-class p1, Ljava/lang/Object;

    .line 26
    .line 27
    invoke-direct {p0, p1}, Llj7;-><init>(Ljava/lang/Class;)V

    .line 28
    .line 29
    .line 30
    return-void

    .line 31
    :pswitch_4
    const-class p1, [B

    .line 32
    .line 33
    invoke-direct {p0, p1}, Llj7;-><init>(Ljava/lang/Class;)V

    .line 34
    .line 35
    .line 36
    return-void

    .line 37
    :pswitch_5
    const-class p1, Luq3;

    .line 38
    .line 39
    invoke-direct {p0, p1}, Llj7;-><init>(Ljava/lang/Class;)V

    .line 40
    .line 41
    .line 42
    return-void

    .line 43
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_0
        :pswitch_0
        :pswitch_2
        :pswitch_1
    .end packed-switch
.end method

.method public synthetic constructor <init>(Ldh8;B)V
    .locals 0

    .line 44
    iput-byte p2, p0, Lc75;->Z:B

    invoke-direct {p0, p1}, Llj7;-><init>(Ldh8;)V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Class;IB)V
    .locals 0

    .line 43
    iput-byte p3, p0, Lc75;->Z:B

    invoke-direct {p0, p2, p1}, Llj7;-><init>(ILjava/lang/Class;)V

    return-void
.end method


# virtual methods
.method public c(Lt37;Ljava/lang/Object;)Z
    .locals 3

    .line 1
    iget-byte v0, p0, Lc75;->Z:B

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x1

    .line 5
    sparse-switch v0, :sswitch_data_0

    .line 6
    .line 7
    .line 8
    invoke-super {p0, p1, p2}, Lar3;->c(Lt37;Ljava/lang/Object;)Z

    .line 9
    .line 10
    .line 11
    move-result p0

    .line 12
    return p0

    .line 13
    :sswitch_0
    return v2

    .line 14
    :sswitch_1
    check-cast p2, [C

    .line 15
    .line 16
    array-length p0, p2

    .line 17
    if-nez p0, :cond_0

    .line 18
    .line 19
    move v1, v2

    .line 20
    :cond_0
    return v1

    .line 21
    :sswitch_2
    check-cast p2, [B

    .line 22
    .line 23
    array-length p0, p2

    .line 24
    if-nez p0, :cond_1

    .line 25
    .line 26
    move v1, v2

    .line 27
    :cond_1
    return v1

    .line 28
    :sswitch_3
    check-cast p2, Luq3;

    .line 29
    .line 30
    return v1

    .line 31
    :sswitch_data_0
    .sparse-switch
        0x1 -> :sswitch_3
        0x2 -> :sswitch_2
        0x6 -> :sswitch_1
        0x8 -> :sswitch_0
    .end sparse-switch
.end method

.method public e(Ljava/lang/Object;Lro3;Lt37;)V
    .locals 1

    .line 1
    iget-byte p0, p0, Lc75;->Z:B

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    packed-switch p0, :pswitch_data_0

    .line 5
    .line 6
    .line 7
    move-object p0, p2

    .line 8
    check-cast p0, Lr59;

    .line 9
    .line 10
    invoke-virtual {p0, p1}, Lr59;->a1(Ljava/lang/Object;)V

    .line 11
    .line 12
    .line 13
    invoke-virtual {p2}, Lro3;->J()V

    .line 14
    .line 15
    .line 16
    return-void

    .line 17
    :pswitch_0
    check-cast p1, Ljava/lang/String;

    .line 18
    .line 19
    invoke-virtual {p2, p1}, Lro3;->U(Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    return-void

    .line 23
    :pswitch_1
    check-cast p1, [C

    .line 24
    .line 25
    sget-object p0, Ln37;->p0:Ln37;

    .line 26
    .line 27
    iget-object p3, p3, Lt37;->X:Ll37;

    .line 28
    .line 29
    invoke-virtual {p3, p0}, Ll37;->j(Ln37;)Z

    .line 30
    .line 31
    .line 32
    move-result p0

    .line 33
    if-eqz p0, :cond_1

    .line 34
    .line 35
    array-length p0, p1

    .line 36
    invoke-virtual {p2, p1}, Lro3;->V0(Ljava/lang/Object;)V

    .line 37
    .line 38
    .line 39
    array-length p0, p1

    .line 40
    :goto_0
    if-ge v0, p0, :cond_0

    .line 41
    .line 42
    const/4 p3, 0x1

    .line 43
    invoke-virtual {p2, p1, v0, p3}, Lro3;->d1([CII)V

    .line 44
    .line 45
    .line 46
    add-int/lit8 v0, v0, 0x1

    .line 47
    .line 48
    goto :goto_0

    .line 49
    :cond_0
    invoke-virtual {p2}, Lro3;->D()V

    .line 50
    .line 51
    .line 52
    goto :goto_1

    .line 53
    :cond_1
    array-length p0, p1

    .line 54
    invoke-virtual {p2, p1, v0, p0}, Lro3;->d1([CII)V

    .line 55
    .line 56
    .line 57
    :goto_1
    return-void

    .line 58
    :pswitch_2
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 59
    .line 60
    .line 61
    move-result-object p0

    .line 62
    check-cast p2, Leq2;

    .line 63
    .line 64
    const-string p1, "write raw value"

    .line 65
    .line 66
    invoke-virtual {p2, p1}, Leq2;->h1(Ljava/lang/String;)V

    .line 67
    .line 68
    .line 69
    invoke-virtual {p2, p0}, Lro3;->C0(Ljava/lang/String;)V

    .line 70
    .line 71
    .line 72
    return-void

    .line 73
    :pswitch_3
    check-cast p1, Ljava/util/Map$Entry;

    .line 74
    .line 75
    invoke-virtual {p2, p1}, Lro3;->a1(Ljava/lang/Object;)V

    .line 76
    .line 77
    .line 78
    const-string p0, "key"

    .line 79
    .line 80
    invoke-interface {p1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 81
    .line 82
    .line 83
    move-result-object v0

    .line 84
    invoke-virtual {p3, p0, v0, p2}, Lt37;->g(Ljava/lang/String;Ljava/lang/Object;Lro3;)V

    .line 85
    .line 86
    .line 87
    const-string p0, "value"

    .line 88
    .line 89
    invoke-interface {p1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 90
    .line 91
    .line 92
    move-result-object p1

    .line 93
    invoke-virtual {p3, p0, p1, p2}, Lt37;->g(Ljava/lang/String;Ljava/lang/Object;Lro3;)V

    .line 94
    .line 95
    .line 96
    invoke-virtual {p2}, Lro3;->J()V

    .line 97
    .line 98
    .line 99
    return-void

    .line 100
    :pswitch_4
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 101
    .line 102
    .line 103
    check-cast p3, Lqf1;

    .line 104
    .line 105
    iget-object p0, p3, Lqf1;->q0:Leq2;

    .line 106
    .line 107
    new-instance p1, Lpp3;

    .line 108
    .line 109
    const/4 p2, 0x0

    .line 110
    const-string p3, "Null key for a Map not allowed in JSON (use a converting NullKeySerializer?)"

    .line 111
    .line 112
    invoke-direct {p1, p0, p3, p2}, Lpp3;-><init>(Ljava/io/Closeable;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 113
    .line 114
    .line 115
    throw p1

    .line 116
    :pswitch_5
    check-cast p1, [B

    .line 117
    .line 118
    iget-object p0, p3, Lt37;->X:Ll37;

    .line 119
    .line 120
    iget-object p0, p0, Lvp4;->Y:Ll20;

    .line 121
    .line 122
    iget-object p0, p0, Ll20;->i0:Ll10;

    .line 123
    .line 124
    array-length p3, p1

    .line 125
    invoke-virtual {p2, p0, p1, v0, p3}, Lro3;->u(Ll10;[BII)V

    .line 126
    .line 127
    .line 128
    return-void

    .line 129
    :pswitch_6
    check-cast p1, Luq3;

    .line 130
    .line 131
    check-cast p1, Ldh8;

    .line 132
    .line 133
    invoke-virtual {p1}, Ldh8;->w0()Ljava/lang/String;

    .line 134
    .line 135
    .line 136
    move-result-object p0

    .line 137
    invoke-virtual {p2, p0}, Lro3;->c1(Ljava/lang/String;)V

    .line 138
    .line 139
    .line 140
    return-void

    .line 141
    :pswitch_7
    invoke-virtual {p2}, Lro3;->X()V

    .line 142
    .line 143
    .line 144
    return-void

    .line 145
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public f(Ljava/lang/Object;Lro3;Lt37;Lri8;)V
    .locals 2

    .line 1
    iget-byte v0, p0, Lc75;->Z:B

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    packed-switch v0, :pswitch_data_0

    .line 5
    .line 6
    .line 7
    :pswitch_0
    invoke-super {p0, p1, p2, p3, p4}, Lar3;->f(Ljava/lang/Object;Lro3;Lt37;Lri8;)V

    .line 8
    .line 9
    .line 10
    return-void

    .line 11
    :pswitch_1
    sget-object p0, Lgr3;->f0:Lgr3;

    .line 12
    .line 13
    invoke-virtual {p4, p1, p0}, Lri8;->d(Ljava/lang/Object;Lgr3;)Lz76;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    invoke-virtual {p4, p2, p0}, Lri8;->e(Lro3;Lz76;)Lz76;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    invoke-virtual {p4, p2, p0}, Lri8;->f(Lro3;Lz76;)Lz76;

    .line 22
    .line 23
    .line 24
    return-void

    .line 25
    :pswitch_2
    check-cast p1, [C

    .line 26
    .line 27
    sget-object p0, Ln37;->p0:Ln37;

    .line 28
    .line 29
    iget-object p3, p3, Lt37;->X:Ll37;

    .line 30
    .line 31
    invoke-virtual {p3, p0}, Ll37;->j(Ln37;)Z

    .line 32
    .line 33
    .line 34
    move-result p0

    .line 35
    if-eqz p0, :cond_0

    .line 36
    .line 37
    sget-object p0, Lgr3;->g0:Lgr3;

    .line 38
    .line 39
    invoke-virtual {p4, p1, p0}, Lri8;->d(Ljava/lang/Object;Lgr3;)Lz76;

    .line 40
    .line 41
    .line 42
    move-result-object p0

    .line 43
    invoke-virtual {p4, p2, p0}, Lri8;->e(Lro3;Lz76;)Lz76;

    .line 44
    .line 45
    .line 46
    move-result-object p0

    .line 47
    array-length p3, p1

    .line 48
    :goto_0
    if-ge v1, p3, :cond_1

    .line 49
    .line 50
    const/4 v0, 0x1

    .line 51
    invoke-virtual {p2, p1, v1, v0}, Lro3;->d1([CII)V

    .line 52
    .line 53
    .line 54
    add-int/lit8 v1, v1, 0x1

    .line 55
    .line 56
    goto :goto_0

    .line 57
    :cond_0
    sget-object p0, Lgr3;->i0:Lgr3;

    .line 58
    .line 59
    invoke-virtual {p4, p1, p0}, Lri8;->d(Ljava/lang/Object;Lgr3;)Lz76;

    .line 60
    .line 61
    .line 62
    move-result-object p0

    .line 63
    invoke-virtual {p4, p2, p0}, Lri8;->e(Lro3;Lz76;)Lz76;

    .line 64
    .line 65
    .line 66
    move-result-object p0

    .line 67
    array-length p3, p1

    .line 68
    invoke-virtual {p2, p1, v1, p3}, Lro3;->d1([CII)V

    .line 69
    .line 70
    .line 71
    :cond_1
    invoke-virtual {p4, p2, p0}, Lri8;->f(Lro3;Lz76;)Lz76;

    .line 72
    .line 73
    .line 74
    return-void

    .line 75
    :pswitch_3
    sget-object v0, Lgr3;->h0:Lgr3;

    .line 76
    .line 77
    invoke-virtual {p4, p1, v0}, Lri8;->d(Ljava/lang/Object;Lgr3;)Lz76;

    .line 78
    .line 79
    .line 80
    move-result-object v0

    .line 81
    invoke-virtual {p4, p2, v0}, Lri8;->e(Lro3;Lz76;)Lz76;

    .line 82
    .line 83
    .line 84
    move-result-object v0

    .line 85
    invoke-virtual {p0, p1, p2, p3}, Lc75;->e(Ljava/lang/Object;Lro3;Lt37;)V

    .line 86
    .line 87
    .line 88
    invoke-virtual {p4, p2, v0}, Lri8;->f(Lro3;Lz76;)Lz76;

    .line 89
    .line 90
    .line 91
    return-void

    .line 92
    :pswitch_4
    check-cast p1, [B

    .line 93
    .line 94
    sget-object p0, Lgr3;->h0:Lgr3;

    .line 95
    .line 96
    invoke-virtual {p4, p1, p0}, Lri8;->d(Ljava/lang/Object;Lgr3;)Lz76;

    .line 97
    .line 98
    .line 99
    move-result-object p0

    .line 100
    invoke-virtual {p4, p2, p0}, Lri8;->e(Lro3;Lz76;)Lz76;

    .line 101
    .line 102
    .line 103
    move-result-object p0

    .line 104
    iget-object p3, p3, Lt37;->X:Ll37;

    .line 105
    .line 106
    iget-object p3, p3, Lvp4;->Y:Ll20;

    .line 107
    .line 108
    iget-object p3, p3, Ll20;->i0:Ll10;

    .line 109
    .line 110
    array-length v0, p1

    .line 111
    invoke-virtual {p2, p3, p1, v1, v0}, Lro3;->u(Ll10;[BII)V

    .line 112
    .line 113
    .line 114
    invoke-virtual {p4, p2, p0}, Lri8;->f(Lro3;Lz76;)Lz76;

    .line 115
    .line 116
    .line 117
    return-void

    .line 118
    :pswitch_5
    check-cast p1, Luq3;

    .line 119
    .line 120
    check-cast p1, Ldh8;

    .line 121
    .line 122
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 123
    .line 124
    .line 125
    new-instance p0, Lz76;

    .line 126
    .line 127
    sget-object p3, Lgr3;->i0:Lgr3;

    .line 128
    .line 129
    invoke-direct {p0, p1, p3}, Lz76;-><init>(Ljava/lang/Object;Lgr3;)V

    .line 130
    .line 131
    .line 132
    invoke-virtual {p4, p2, p0}, Lri8;->e(Lro3;Lz76;)Lz76;

    .line 133
    .line 134
    .line 135
    invoke-virtual {p1}, Ldh8;->w0()Ljava/lang/String;

    .line 136
    .line 137
    .line 138
    move-result-object p1

    .line 139
    invoke-virtual {p2, p1}, Lro3;->c1(Ljava/lang/String;)V

    .line 140
    .line 141
    .line 142
    invoke-virtual {p4, p2, p0}, Lri8;->f(Lro3;Lz76;)Lz76;

    .line 143
    .line 144
    .line 145
    return-void

    .line 146
    :pswitch_6
    invoke-virtual {p2}, Lro3;->X()V

    .line 147
    .line 148
    .line 149
    return-void

    .line 150
    nop

    .line 151
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_0
        :pswitch_0
        :pswitch_3
        :pswitch_2
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method
