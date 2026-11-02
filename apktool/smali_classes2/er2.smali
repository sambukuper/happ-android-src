.class public final Ler2;
.super Luy7;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Lrn2;


# instance fields
.field public final synthetic g0:B

.field public h0:B

.field public synthetic i0:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILq51;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, Ler2;->g0:B

    .line 2
    .line 3
    invoke-direct {p0, p1, p2}, Luy7;-><init>(ILq51;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final K(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    .line 1
    iget-byte v0, p0, Ler2;->g0:B

    .line 2
    .line 3
    sget-object v1, Lc71;->X:Lc71;

    .line 4
    .line 5
    sget-object v2, Ldn8;->a:Ldn8;

    .line 6
    .line 7
    check-cast p1, Lze2;

    .line 8
    .line 9
    check-cast p2, Lq51;

    .line 10
    .line 11
    packed-switch v0, :pswitch_data_0

    .line 12
    .line 13
    .line 14
    invoke-virtual {p0, p2, p1}, Ler2;->n(Lq51;Ljava/lang/Object;)Lq51;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    check-cast p0, Ler2;

    .line 19
    .line 20
    invoke-virtual {p0, v2}, Ler2;->q(Ljava/lang/Object;)Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    return-object v1

    .line 24
    :pswitch_0
    invoke-virtual {p0, p2, p1}, Ler2;->n(Lq51;Ljava/lang/Object;)Lq51;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    check-cast p0, Ler2;

    .line 29
    .line 30
    invoke-virtual {p0, v2}, Ler2;->q(Ljava/lang/Object;)Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    return-object v1

    .line 34
    nop

    .line 35
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final n(Lq51;Ljava/lang/Object;)Lq51;
    .locals 2

    .line 1
    iget-byte p0, p0, Ler2;->g0:B

    .line 2
    .line 3
    packed-switch p0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    new-instance p0, Ler2;

    .line 7
    .line 8
    const/4 v0, 0x2

    .line 9
    const/4 v1, 0x1

    .line 10
    invoke-direct {p0, v0, p1, v1}, Ler2;-><init>(ILq51;B)V

    .line 11
    .line 12
    .line 13
    iput-object p2, p0, Ler2;->i0:Ljava/lang/Object;

    .line 14
    .line 15
    return-object p0

    .line 16
    :pswitch_0
    new-instance p0, Ler2;

    .line 17
    .line 18
    const/4 v0, 0x2

    .line 19
    const/4 v1, 0x0

    .line 20
    invoke-direct {p0, v0, p1, v1}, Ler2;-><init>(ILq51;B)V

    .line 21
    .line 22
    .line 23
    iput-object p2, p0, Ler2;->i0:Ljava/lang/Object;

    .line 24
    .line 25
    return-object p0

    .line 26
    nop

    .line 27
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final q(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    .line 1
    iget-byte v0, p0, Ler2;->g0:B

    .line 2
    .line 3
    sget-object v1, Llx1;->Z:Llx1;

    .line 4
    .line 5
    const-wide/16 v2, 0x1388

    .line 6
    .line 7
    const/4 v4, 0x0

    .line 8
    const-string v5, "call to \'resume\' before \'invoke\' with coroutine"

    .line 9
    .line 10
    sget-object v6, Lc71;->X:Lc71;

    .line 11
    .line 12
    const/4 v7, 0x1

    .line 13
    const/4 v8, 0x2

    .line 14
    packed-switch v0, :pswitch_data_0

    .line 15
    .line 16
    .line 17
    iget-object v0, p0, Ler2;->i0:Ljava/lang/Object;

    .line 18
    .line 19
    check-cast v0, Lze2;

    .line 20
    .line 21
    iget-byte v9, p0, Ler2;->h0:B

    .line 22
    .line 23
    if-eqz v9, :cond_2

    .line 24
    .line 25
    if-eq v9, v7, :cond_1

    .line 26
    .line 27
    if-ne v9, v8, :cond_0

    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_0
    invoke-static {v5}, Lbt;->i(Ljava/lang/String;)V

    .line 31
    .line 32
    .line 33
    goto :goto_3

    .line 34
    :cond_1
    invoke-static {p1}, Lw39;->n0(Ljava/lang/Object;)V

    .line 35
    .line 36
    .line 37
    goto :goto_1

    .line 38
    :cond_2
    :goto_0
    invoke-static {p1}, Lw39;->n0(Ljava/lang/Object;)V

    .line 39
    .line 40
    .line 41
    :cond_3
    sget-object p1, Lwe3;->a:Lmu0;

    .line 42
    .line 43
    invoke-interface {p1}, Lmu0;->a()Lte3;

    .line 44
    .line 45
    .line 46
    move-result-object p1

    .line 47
    invoke-virtual {p1}, Lte3;->a()J

    .line 48
    .line 49
    .line 50
    move-result-wide v4

    .line 51
    new-instance p1, Ljava/lang/Long;

    .line 52
    .line 53
    invoke-direct {p1, v4, v5}, Ljava/lang/Long;-><init>(J)V

    .line 54
    .line 55
    .line 56
    iput-object v0, p0, Ler2;->i0:Ljava/lang/Object;

    .line 57
    .line 58
    iput-byte v7, p0, Ler2;->h0:B

    .line 59
    .line 60
    invoke-interface {v0, p1, p0}, Lze2;->l(Ljava/lang/Object;Lq51;)Ljava/lang/Object;

    .line 61
    .line 62
    .line 63
    move-result-object p1

    .line 64
    if-ne p1, v6, :cond_4

    .line 65
    .line 66
    goto :goto_2

    .line 67
    :cond_4
    :goto_1
    sget-object p1, Lgx1;->Y:Lbe;

    .line 68
    .line 69
    invoke-static {v2, v3, v1}, Lvj8;->m0(JLlx1;)J

    .line 70
    .line 71
    .line 72
    move-result-wide v4

    .line 73
    iput-object v0, p0, Ler2;->i0:Ljava/lang/Object;

    .line 74
    .line 75
    iput-byte v8, p0, Ler2;->h0:B

    .line 76
    .line 77
    invoke-static {v4, v5, p0}, Lu70;->G(JLq51;)Ljava/lang/Object;

    .line 78
    .line 79
    .line 80
    move-result-object p1

    .line 81
    if-ne p1, v6, :cond_3

    .line 82
    .line 83
    :goto_2
    move-object v4, v6

    .line 84
    :goto_3
    return-object v4

    .line 85
    :pswitch_0
    iget-object v0, p0, Ler2;->i0:Ljava/lang/Object;

    .line 86
    .line 87
    check-cast v0, Lze2;

    .line 88
    .line 89
    iget-byte v9, p0, Ler2;->h0:B

    .line 90
    .line 91
    if-eqz v9, :cond_7

    .line 92
    .line 93
    if-eq v9, v7, :cond_6

    .line 94
    .line 95
    if-ne v9, v8, :cond_5

    .line 96
    .line 97
    goto :goto_4

    .line 98
    :cond_5
    invoke-static {v5}, Lbt;->i(Ljava/lang/String;)V

    .line 99
    .line 100
    .line 101
    goto :goto_7

    .line 102
    :cond_6
    invoke-static {p1}, Lw39;->n0(Ljava/lang/Object;)V

    .line 103
    .line 104
    .line 105
    goto :goto_5

    .line 106
    :cond_7
    :goto_4
    invoke-static {p1}, Lw39;->n0(Ljava/lang/Object;)V

    .line 107
    .line 108
    .line 109
    :cond_8
    iput-object v0, p0, Ler2;->i0:Ljava/lang/Object;

    .line 110
    .line 111
    iput-byte v7, p0, Ler2;->h0:B

    .line 112
    .line 113
    sget-object p1, Ldn8;->a:Ldn8;

    .line 114
    .line 115
    invoke-interface {v0, p1, p0}, Lze2;->l(Ljava/lang/Object;Lq51;)Ljava/lang/Object;

    .line 116
    .line 117
    .line 118
    move-result-object p1

    .line 119
    if-ne p1, v6, :cond_9

    .line 120
    .line 121
    goto :goto_6

    .line 122
    :cond_9
    :goto_5
    sget-object p1, Lgx1;->Y:Lbe;

    .line 123
    .line 124
    invoke-static {v2, v3, v1}, Lvj8;->m0(JLlx1;)J

    .line 125
    .line 126
    .line 127
    move-result-wide v4

    .line 128
    iput-object v0, p0, Ler2;->i0:Ljava/lang/Object;

    .line 129
    .line 130
    iput-byte v8, p0, Ler2;->h0:B

    .line 131
    .line 132
    invoke-static {v4, v5, p0}, Lu70;->G(JLq51;)Ljava/lang/Object;

    .line 133
    .line 134
    .line 135
    move-result-object p1

    .line 136
    if-ne p1, v6, :cond_8

    .line 137
    .line 138
    :goto_6
    move-object v4, v6

    .line 139
    :goto_7
    return-object v4

    .line 140
    nop

    .line 141
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
