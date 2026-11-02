.class public final synthetic Lru1;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Lgn2;


# instance fields
.field public final synthetic X:B

.field public final synthetic Y:F

.field public final synthetic Z:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(FLaa6;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-byte v0, p0, Lru1;->X:B

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput p1, p0, Lru1;->Y:F

    .line 8
    .line 9
    iput-object p2, p0, Lru1;->Z:Ljava/lang/Object;

    .line 10
    .line 11
    return-void
.end method

.method public synthetic constructor <init>(Lce8;F)V
    .locals 1

    .line 12
    const/4 v0, 0x1

    iput-byte v0, p0, Lru1;->X:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lru1;->Z:Ljava/lang/Object;

    iput p2, p0, Lru1;->Y:F

    return-void
.end method


# virtual methods
.method public final B(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    .line 1
    iget-byte v0, p0, Lru1;->X:B

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x1

    .line 5
    iget v3, p0, Lru1;->Y:F

    .line 6
    .line 7
    iget-object p0, p0, Lru1;->Z:Ljava/lang/Object;

    .line 8
    .line 9
    packed-switch v0, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    check-cast p0, Lce8;

    .line 13
    .line 14
    check-cast p1, Ljava/lang/Long;

    .line 15
    .line 16
    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    .line 17
    .line 18
    .line 19
    move-result-wide v4

    .line 20
    invoke-virtual {p0}, Lce8;->g()Z

    .line 21
    .line 22
    .line 23
    move-result p1

    .line 24
    iget-object v0, p0, Lce8;->h:Lph5;

    .line 25
    .line 26
    if-nez p1, :cond_4

    .line 27
    .line 28
    invoke-virtual {v0}, Lph5;->l()J

    .line 29
    .line 30
    .line 31
    move-result-wide v6

    .line 32
    const-wide/high16 v8, -0x8000000000000000L

    .line 33
    .line 34
    cmp-long p1, v6, v8

    .line 35
    .line 36
    if-nez p1, :cond_0

    .line 37
    .line 38
    invoke-virtual {v0, v4, v5}, Lph5;->m(J)V

    .line 39
    .line 40
    .line 41
    iget-object p1, p0, Lce8;->a:Lb15;

    .line 42
    .line 43
    iget-object p1, p1, Lb15;->a:Lrh5;

    .line 44
    .line 45
    sget-object v6, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 46
    .line 47
    invoke-virtual {p1, v6}, Lrh5;->setValue(Ljava/lang/Object;)V

    .line 48
    .line 49
    .line 50
    :cond_0
    invoke-virtual {v0}, Lph5;->l()J

    .line 51
    .line 52
    .line 53
    move-result-wide v6

    .line 54
    sub-long/2addr v4, v6

    .line 55
    const/4 p1, 0x0

    .line 56
    cmpg-float p1, v3, p1

    .line 57
    .line 58
    if-nez p1, :cond_1

    .line 59
    .line 60
    goto :goto_0

    .line 61
    :cond_1
    long-to-double v4, v4

    .line 62
    float-to-double v6, v3

    .line 63
    div-double/2addr v4, v6

    .line 64
    invoke-static {v4, v5}, Lnr4;->P(D)J

    .line 65
    .line 66
    .line 67
    move-result-wide v4

    .line 68
    :goto_0
    iget-object v0, p0, Lce8;->b:Lce8;

    .line 69
    .line 70
    if-nez v0, :cond_2

    .line 71
    .line 72
    iget-object v0, p0, Lce8;->g:Lph5;

    .line 73
    .line 74
    invoke-virtual {v0, v4, v5}, Lph5;->m(J)V

    .line 75
    .line 76
    .line 77
    :cond_2
    if-nez p1, :cond_3

    .line 78
    .line 79
    move v1, v2

    .line 80
    :cond_3
    invoke-virtual {p0, v4, v5, v1}, Lce8;->h(JZ)V

    .line 81
    .line 82
    .line 83
    :cond_4
    sget-object p0, Ldn8;->a:Ldn8;

    .line 84
    .line 85
    return-object p0

    .line 86
    :pswitch_0
    check-cast p0, Laa6;

    .line 87
    .line 88
    check-cast p1, Lhv1;

    .line 89
    .line 90
    invoke-interface {p1}, Lnr2;->Q()Ljava/lang/String;

    .line 91
    .line 92
    .line 93
    move-result-object v0

    .line 94
    const-string v4, "waiting"

    .line 95
    .line 96
    invoke-static {v0, v4}, Ldh3;->f(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 97
    .line 98
    .line 99
    move-result v0

    .line 100
    invoke-interface {p1}, Lhv1;->a0()Lsd5;

    .line 101
    .line 102
    .line 103
    move-result-object v4

    .line 104
    if-nez v4, :cond_6

    .line 105
    .line 106
    :cond_5
    move p1, v1

    .line 107
    goto :goto_2

    .line 108
    :cond_6
    invoke-interface {p1}, Lhv1;->a0()Lsd5;

    .line 109
    .line 110
    .line 111
    move-result-object p1

    .line 112
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 113
    .line 114
    .line 115
    sget-object v4, Ljv1;->a:Liv1;

    .line 116
    .line 117
    sget-object v4, Lsd5;->Y:Lsd5;

    .line 118
    .line 119
    const/high16 v5, 0x41f00000    # 30.0f

    .line 120
    .line 121
    if-ne p1, v4, :cond_7

    .line 122
    .line 123
    cmpg-float p1, v3, v5

    .line 124
    .line 125
    if-gtz p1, :cond_5

    .line 126
    .line 127
    :goto_1
    move p1, v2

    .line 128
    goto :goto_2

    .line 129
    :cond_7
    cmpl-float p1, v3, v5

    .line 130
    .line 131
    if-lez p1, :cond_5

    .line 132
    .line 133
    const/high16 p1, 0x42b40000    # 90.0f

    .line 134
    .line 135
    cmpg-float p1, v3, p1

    .line 136
    .line 137
    if-gtz p1, :cond_5

    .line 138
    .line 139
    goto :goto_1

    .line 140
    :goto_2
    iget-boolean v3, p0, Laa6;->X:Z

    .line 141
    .line 142
    if-nez v3, :cond_8

    .line 143
    .line 144
    if-eqz v0, :cond_9

    .line 145
    .line 146
    if-eqz p1, :cond_9

    .line 147
    .line 148
    :cond_8
    move v1, v2

    .line 149
    :cond_9
    iput-boolean v1, p0, Laa6;->X:Z

    .line 150
    .line 151
    xor-int/lit8 p0, v1, 0x1

    .line 152
    .line 153
    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 154
    .line 155
    .line 156
    move-result-object p0

    .line 157
    return-object p0

    .line 158
    nop

    .line 159
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
