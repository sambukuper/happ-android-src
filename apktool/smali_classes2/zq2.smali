.class public final Lzq2;
.super Luy7;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Lrn2;


# instance fields
.field public final synthetic g0:B

.field public h0:Z

.field public final synthetic i0:Ldr2;


# direct methods
.method public synthetic constructor <init>(Ldr2;Lq51;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, Lzq2;->g0:B

    .line 2
    .line 3
    iput-object p1, p0, Lzq2;->i0:Ldr2;

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
    iget-byte v0, p0, Lzq2;->g0:B

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
    invoke-virtual {p0, p2, p1}, Lzq2;->n(Lq51;Ljava/lang/Object;)Lq51;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    check-cast p0, Lzq2;

    .line 17
    .line 18
    invoke-virtual {p0, v1}, Lzq2;->q(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0

    .line 23
    :pswitch_0
    invoke-virtual {p0, p2, p1}, Lzq2;->n(Lq51;Ljava/lang/Object;)Lq51;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    check-cast p0, Lzq2;

    .line 28
    .line 29
    invoke-virtual {p0, v1}, Lzq2;->q(Ljava/lang/Object;)Ljava/lang/Object;

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
    iget-byte p2, p0, Lzq2;->g0:B

    .line 2
    .line 3
    packed-switch p2, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    new-instance p2, Lzq2;

    .line 7
    .line 8
    iget-object p0, p0, Lzq2;->i0:Ldr2;

    .line 9
    .line 10
    const/4 v0, 0x1

    .line 11
    invoke-direct {p2, p0, p1, v0}, Lzq2;-><init>(Ldr2;Lq51;B)V

    .line 12
    .line 13
    .line 14
    return-object p2

    .line 15
    :pswitch_0
    new-instance p2, Lzq2;

    .line 16
    .line 17
    iget-object p0, p0, Lzq2;->i0:Ldr2;

    .line 18
    .line 19
    const/4 v0, 0x0

    .line 20
    invoke-direct {p2, p0, p1, v0}, Lzq2;-><init>(Ldr2;Lq51;B)V

    .line 21
    .line 22
    .line 23
    return-object p2

    .line 24
    nop

    .line 25
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final q(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    .line 1
    iget-byte v0, p0, Lzq2;->g0:B

    .line 2
    .line 3
    sget-object v1, Ldn8;->a:Ldn8;

    .line 4
    .line 5
    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 6
    .line 7
    sget-object v3, Lc71;->X:Lc71;

    .line 8
    .line 9
    iget-object v4, p0, Lzq2;->i0:Ldr2;

    .line 10
    .line 11
    const/4 v5, 0x1

    .line 12
    const/4 v6, 0x0

    .line 13
    packed-switch v0, :pswitch_data_0

    .line 14
    .line 15
    .line 16
    iget-boolean v0, p0, Lzq2;->h0:Z

    .line 17
    .line 18
    if-eqz v0, :cond_1

    .line 19
    .line 20
    if-ne v0, v5, :cond_0

    .line 21
    .line 22
    invoke-static {p1}, Lw39;->n0(Ljava/lang/Object;)V

    .line 23
    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_0
    invoke-static {v2}, Lbt;->i(Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    move-object v1, v6

    .line 30
    goto :goto_0

    .line 31
    :cond_1
    invoke-static {p1}, Lw39;->n0(Ljava/lang/Object;)V

    .line 32
    .line 33
    .line 34
    iget-object p1, v4, Ldr2;->b:Lvz7;

    .line 35
    .line 36
    invoke-virtual {p1}, Lvz7;->getValue()Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object p1

    .line 40
    check-cast p1, Lmn6;

    .line 41
    .line 42
    iget-object p1, p1, Lmn6;->h:Lvz7;

    .line 43
    .line 44
    invoke-virtual {p1}, Lvz7;->getValue()Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object p1

    .line 48
    check-cast p1, Lmh7;

    .line 49
    .line 50
    new-instance v0, Ler2;

    .line 51
    .line 52
    const/4 v2, 0x2

    .line 53
    const/4 v7, 0x0

    .line 54
    invoke-direct {v0, v2, v6, v7}, Ler2;-><init>(ILq51;B)V

    .line 55
    .line 56
    .line 57
    new-instance v2, Lj31;

    .line 58
    .line 59
    const/4 v8, 0x7

    .line 60
    invoke-direct {v2, v0, v8}, Lj31;-><init>(Ljava/lang/Object;B)V

    .line 61
    .line 62
    .line 63
    new-instance v0, Lar2;

    .line 64
    .line 65
    const/4 v8, 0x3

    .line 66
    invoke-direct {v0, v8, v6}, Lar2;-><init>(ILq51;)V

    .line 67
    .line 68
    .line 69
    new-instance v8, Lqg2;

    .line 70
    .line 71
    invoke-direct {v8, p1, v2, v0, v7}, Lqg2;-><init>(Lxe2;Ljava/lang/Object;Lon2;B)V

    .line 72
    .line 73
    .line 74
    new-instance p1, Llf2;

    .line 75
    .line 76
    const/4 v0, 0x5

    .line 77
    invoke-direct {p1, v8, v4, v0}, Llf2;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 78
    .line 79
    .line 80
    sget-object v0, Ltp1;->a:Lnf1;

    .line 81
    .line 82
    invoke-static {p1, v0}, Lzc1;->H(Lxe2;Ls61;)Lxe2;

    .line 83
    .line 84
    .line 85
    move-result-object p1

    .line 86
    new-instance v0, Lk;

    .line 87
    .line 88
    const/16 v2, 0xc

    .line 89
    .line 90
    invoke-direct {v0, v4, v6, v2}, Lk;-><init>(Ljava/lang/Object;Lq51;B)V

    .line 91
    .line 92
    .line 93
    iput-boolean v5, p0, Lzq2;->h0:Z

    .line 94
    .line 95
    invoke-static {p1, v0, p0}, Lz91;->n(Lxe2;Lrn2;Lq51;)Ljava/lang/Object;

    .line 96
    .line 97
    .line 98
    move-result-object p0

    .line 99
    if-ne p0, v3, :cond_2

    .line 100
    .line 101
    move-object v1, v3

    .line 102
    :cond_2
    :goto_0
    return-object v1

    .line 103
    :pswitch_0
    iget-boolean v0, p0, Lzq2;->h0:Z

    .line 104
    .line 105
    if-eqz v0, :cond_4

    .line 106
    .line 107
    if-ne v0, v5, :cond_3

    .line 108
    .line 109
    invoke-static {p1}, Lw39;->n0(Ljava/lang/Object;)V

    .line 110
    .line 111
    .line 112
    goto :goto_2

    .line 113
    :cond_3
    invoke-static {v2}, Lbt;->i(Ljava/lang/String;)V

    .line 114
    .line 115
    .line 116
    move-object v1, v6

    .line 117
    goto :goto_2

    .line 118
    :cond_4
    invoke-static {p1}, Lw39;->n0(Ljava/lang/Object;)V

    .line 119
    .line 120
    .line 121
    iput-boolean v5, p0, Lzq2;->h0:Z

    .line 122
    .line 123
    iget-object p1, v4, Ldr2;->e:Lu77;

    .line 124
    .line 125
    sget-object v0, Lqq2;->a:Lqq2;

    .line 126
    .line 127
    invoke-virtual {p1, v0, p0}, Lu77;->l(Ljava/lang/Object;Lq51;)Ljava/lang/Object;

    .line 128
    .line 129
    .line 130
    move-result-object p0

    .line 131
    if-ne p0, v3, :cond_5

    .line 132
    .line 133
    goto :goto_1

    .line 134
    :cond_5
    move-object p0, v1

    .line 135
    :goto_1
    if-ne p0, v3, :cond_6

    .line 136
    .line 137
    move-object v1, v3

    .line 138
    :cond_6
    :goto_2
    return-object v1

    .line 139
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
