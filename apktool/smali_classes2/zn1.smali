.class public final Lzn1;
.super Luy7;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Lrn2;


# instance fields
.field public final synthetic g0:B

.field public h0:Leo1;

.field public i0:Z

.field public final synthetic j0:Leo1;


# direct methods
.method public synthetic constructor <init>(Leo1;Lq51;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, Lzn1;->g0:B

    .line 2
    .line 3
    iput-object p1, p0, Lzn1;->j0:Leo1;

    .line 4
    .line 5
    const/4 p1, 0x2

    .line 6
    invoke-direct {p0, p1, p2}, Luy7;-><init>(ILq51;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public final K(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    iget-byte v0, p0, Lzn1;->g0:B

    .line 2
    .line 3
    sget-object v1, Ldn8;->a:Ldn8;

    .line 4
    .line 5
    check-cast p1, Lb71;

    .line 6
    .line 7
    check-cast p2, Lq51;

    .line 8
    .line 9
    packed-switch v0, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    invoke-virtual {p0, p2, p1}, Lzn1;->n(Lq51;Ljava/lang/Object;)Lq51;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    check-cast p0, Lzn1;

    .line 17
    .line 18
    invoke-virtual {p0, v1}, Lzn1;->q(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0

    .line 23
    :pswitch_0
    invoke-virtual {p0, p2, p1}, Lzn1;->n(Lq51;Ljava/lang/Object;)Lq51;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    check-cast p0, Lzn1;

    .line 28
    .line 29
    invoke-virtual {p0, v1}, Lzn1;->q(Ljava/lang/Object;)Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    return-object p0

    .line 34
    nop

    .line 35
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final n(Lq51;Ljava/lang/Object;)Lq51;
    .locals 1

    .line 1
    iget-byte p2, p0, Lzn1;->g0:B

    .line 2
    .line 3
    iget-object p0, p0, Lzn1;->j0:Leo1;

    .line 4
    .line 5
    packed-switch p2, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    new-instance p2, Lzn1;

    .line 9
    .line 10
    const/4 v0, 0x1

    .line 11
    invoke-direct {p2, p0, p1, v0}, Lzn1;-><init>(Leo1;Lq51;B)V

    .line 12
    .line 13
    .line 14
    return-object p2

    .line 15
    :pswitch_0
    new-instance p2, Lzn1;

    .line 16
    .line 17
    const/4 v0, 0x0

    .line 18
    invoke-direct {p2, p0, p1, v0}, Lzn1;-><init>(Leo1;Lq51;B)V

    .line 19
    .line 20
    .line 21
    return-object p2

    .line 22
    nop

    .line 23
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final q(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    .line 1
    iget-byte v0, p0, Lzn1;->g0:B

    .line 2
    .line 3
    sget-object v1, Ldn8;->a:Ldn8;

    .line 4
    .line 5
    const/4 v2, 0x2

    .line 6
    const/16 v3, 0x8

    .line 7
    .line 8
    iget-object v4, p0, Lzn1;->j0:Leo1;

    .line 9
    .line 10
    const-string v5, "call to \'resume\' before \'invoke\' with coroutine"

    .line 11
    .line 12
    sget-object v6, Lc71;->X:Lc71;

    .line 13
    .line 14
    const/4 v7, 0x1

    .line 15
    const/4 v8, 0x0

    .line 16
    packed-switch v0, :pswitch_data_0

    .line 17
    .line 18
    .line 19
    iget-boolean v0, p0, Lzn1;->i0:Z

    .line 20
    .line 21
    if-eqz v0, :cond_1

    .line 22
    .line 23
    if-ne v0, v7, :cond_0

    .line 24
    .line 25
    iget-object v4, p0, Lzn1;->h0:Leo1;

    .line 26
    .line 27
    invoke-static {p1}, Lw39;->n0(Ljava/lang/Object;)V

    .line 28
    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_0
    invoke-static {v5}, Lbt;->i(Ljava/lang/String;)V

    .line 32
    .line 33
    .line 34
    move-object v1, v8

    .line 35
    goto :goto_1

    .line 36
    :cond_1
    invoke-static {p1}, Lw39;->n0(Ljava/lang/Object;)V

    .line 37
    .line 38
    .line 39
    invoke-virtual {v4}, Leo1;->Z()Ll27;

    .line 40
    .line 41
    .line 42
    move-result-object p1

    .line 43
    iput-object v4, p0, Lzn1;->h0:Leo1;

    .line 44
    .line 45
    iput-boolean v7, p0, Lzn1;->i0:Z

    .line 46
    .line 47
    invoke-virtual {p1, p0}, Ll27;->f(Ls51;)Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    move-result-object p1

    .line 51
    if-ne p1, v6, :cond_2

    .line 52
    .line 53
    move-object v1, v6

    .line 54
    goto :goto_1

    .line 55
    :cond_2
    :goto_0
    check-cast p1, Lr27;

    .line 56
    .line 57
    iget-object p0, v4, Lqk2;->S0:Lg94;

    .line 58
    .line 59
    invoke-static {p0}, Lys0;->z(Lg94;)Lu84;

    .line 60
    .line 61
    .line 62
    move-result-object p0

    .line 63
    sget-object v0, Ltp1;->a:Lnf1;

    .line 64
    .line 65
    sget-object v0, Ldm4;->a:Lhv2;

    .line 66
    .line 67
    new-instance v5, Lk;

    .line 68
    .line 69
    invoke-direct {v5, p1, v4, v8, v3}, Lk;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lq51;B)V

    .line 70
    .line 71
    .line 72
    invoke-static {p0, v0, v5, v2}, Ljm4;->Q(Lb71;Lu61;Lrn2;I)Log7;

    .line 73
    .line 74
    .line 75
    :goto_1
    return-object v1

    .line 76
    :pswitch_0
    iget-boolean v0, p0, Lzn1;->i0:Z

    .line 77
    .line 78
    if-eqz v0, :cond_4

    .line 79
    .line 80
    if-ne v0, v7, :cond_3

    .line 81
    .line 82
    iget-object v4, p0, Lzn1;->h0:Leo1;

    .line 83
    .line 84
    invoke-static {p1}, Lw39;->n0(Ljava/lang/Object;)V

    .line 85
    .line 86
    .line 87
    goto :goto_2

    .line 88
    :cond_3
    invoke-static {v5}, Lbt;->i(Ljava/lang/String;)V

    .line 89
    .line 90
    .line 91
    move-object v1, v8

    .line 92
    goto :goto_3

    .line 93
    :cond_4
    invoke-static {p1}, Lw39;->n0(Ljava/lang/Object;)V

    .line 94
    .line 95
    .line 96
    invoke-virtual {v4}, Leo1;->Z()Ll27;

    .line 97
    .line 98
    .line 99
    move-result-object p1

    .line 100
    iput-object v4, p0, Lzn1;->h0:Leo1;

    .line 101
    .line 102
    iput-boolean v7, p0, Lzn1;->i0:Z

    .line 103
    .line 104
    invoke-virtual {p1, p0}, Ll27;->g(Ls51;)Ljava/lang/Object;

    .line 105
    .line 106
    .line 107
    move-result-object p1

    .line 108
    if-ne p1, v6, :cond_5

    .line 109
    .line 110
    move-object v1, v6

    .line 111
    goto :goto_3

    .line 112
    :cond_5
    :goto_2
    check-cast p1, Lr27;

    .line 113
    .line 114
    iget-object p0, v4, Lqk2;->S0:Lg94;

    .line 115
    .line 116
    invoke-static {p0}, Lys0;->z(Lg94;)Lu84;

    .line 117
    .line 118
    .line 119
    move-result-object p0

    .line 120
    sget-object v0, Ltp1;->a:Lnf1;

    .line 121
    .line 122
    sget-object v0, Ldm4;->a:Lhv2;

    .line 123
    .line 124
    new-instance v5, Lk;

    .line 125
    .line 126
    invoke-direct {v5, p1, v4, v8, v3}, Lk;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lq51;B)V

    .line 127
    .line 128
    .line 129
    invoke-static {p0, v0, v5, v2}, Ljm4;->Q(Lb71;Lu61;Lrn2;I)Log7;

    .line 130
    .line 131
    .line 132
    :goto_3
    return-object v1

    .line 133
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
