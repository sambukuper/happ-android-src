.class public final Lza1;
.super Luy7;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Lrn2;


# instance fields
.field public final synthetic g0:B

.field public h0:B

.field public final synthetic i0:Lib1;


# direct methods
.method public synthetic constructor <init>(Lib1;Lq51;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, Lza1;->g0:B

    .line 2
    .line 3
    iput-object p1, p0, Lza1;->i0:Lib1;

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
    iget-byte v0, p0, Lza1;->g0:B

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
    invoke-virtual {p0, p2, p1}, Lza1;->n(Lq51;Ljava/lang/Object;)Lq51;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    check-cast p0, Lza1;

    .line 17
    .line 18
    invoke-virtual {p0, v1}, Lza1;->q(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0

    .line 23
    :pswitch_0
    invoke-virtual {p0, p2, p1}, Lza1;->n(Lq51;Ljava/lang/Object;)Lq51;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    check-cast p0, Lza1;

    .line 28
    .line 29
    invoke-virtual {p0, v1}, Lza1;->q(Ljava/lang/Object;)Ljava/lang/Object;

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
    iget-byte p2, p0, Lza1;->g0:B

    .line 2
    .line 3
    iget-object p0, p0, Lza1;->i0:Lib1;

    .line 4
    .line 5
    packed-switch p2, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    new-instance p2, Lza1;

    .line 9
    .line 10
    const/4 v0, 0x1

    .line 11
    invoke-direct {p2, p0, p1, v0}, Lza1;-><init>(Lib1;Lq51;B)V

    .line 12
    .line 13
    .line 14
    return-object p2

    .line 15
    :pswitch_0
    new-instance p2, Lza1;

    .line 16
    .line 17
    const/4 v0, 0x0

    .line 18
    invoke-direct {p2, p0, p1, v0}, Lza1;-><init>(Lib1;Lq51;B)V

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
    iget-byte v0, p0, Lza1;->g0:B

    .line 2
    .line 3
    const/4 v1, -0x1

    .line 4
    const/4 v2, 0x0

    .line 5
    const-string v3, "call to \'resume\' before \'invoke\' with coroutine"

    .line 6
    .line 7
    sget-object v4, Lc71;->X:Lc71;

    .line 8
    .line 9
    iget-object v5, p0, Lza1;->i0:Lib1;

    .line 10
    .line 11
    const/4 v6, 0x1

    .line 12
    const/4 v7, 0x2

    .line 13
    packed-switch v0, :pswitch_data_0

    .line 14
    .line 15
    .line 16
    iget-object v0, v5, Lib1;->j0:Ljb1;

    .line 17
    .line 18
    iget-byte v8, p0, Lza1;->h0:B

    .line 19
    .line 20
    if-eqz v8, :cond_2

    .line 21
    .line 22
    if-eq v8, v6, :cond_1

    .line 23
    .line 24
    if-ne v8, v7, :cond_0

    .line 25
    .line 26
    invoke-static {p1}, Lw39;->n0(Ljava/lang/Object;)V

    .line 27
    .line 28
    .line 29
    goto :goto_2

    .line 30
    :cond_0
    invoke-static {v3}, Lbt;->i(Ljava/lang/String;)V

    .line 31
    .line 32
    .line 33
    goto :goto_4

    .line 34
    :cond_1
    :try_start_0
    invoke-static {p1}, Lw39;->n0(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 35
    .line 36
    .line 37
    goto :goto_0

    .line 38
    :catchall_0
    move-exception p0

    .line 39
    goto :goto_3

    .line 40
    :cond_2
    invoke-static {p1}, Lw39;->n0(Ljava/lang/Object;)V

    .line 41
    .line 42
    .line 43
    invoke-virtual {v0}, Ljb1;->b()Lhh7;

    .line 44
    .line 45
    .line 46
    move-result-object p1

    .line 47
    instance-of p1, p1, Lma2;

    .line 48
    .line 49
    if-eqz p1, :cond_3

    .line 50
    .line 51
    invoke-virtual {v0}, Ljb1;->b()Lhh7;

    .line 52
    .line 53
    .line 54
    move-result-object v2

    .line 55
    goto :goto_4

    .line 56
    :cond_3
    :try_start_1
    iput-byte v6, p0, Lza1;->h0:B

    .line 57
    .line 58
    invoke-virtual {v5, p0}, Lib1;->e(Ls51;)Ljava/lang/Object;

    .line 59
    .line 60
    .line 61
    move-result-object p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 62
    if-ne p1, v4, :cond_4

    .line 63
    .line 64
    goto :goto_1

    .line 65
    :cond_4
    :goto_0
    iput-byte v7, p0, Lza1;->h0:B

    .line 66
    .line 67
    const/4 p1, 0x0

    .line 68
    invoke-virtual {v5, p1, p0}, Lib1;->f(ZLq51;)Ljava/lang/Object;

    .line 69
    .line 70
    .line 71
    move-result-object p1

    .line 72
    if-ne p1, v4, :cond_5

    .line 73
    .line 74
    :goto_1
    move-object v2, v4

    .line 75
    goto :goto_4

    .line 76
    :cond_5
    :goto_2
    move-object v2, p1

    .line 77
    check-cast v2, Lhh7;

    .line 78
    .line 79
    goto :goto_4

    .line 80
    :goto_3
    new-instance v2, Lu66;

    .line 81
    .line 82
    invoke-direct {v2, p0, v1}, Lu66;-><init>(Ljava/lang/Throwable;I)V

    .line 83
    .line 84
    .line 85
    :goto_4
    return-object v2

    .line 86
    :pswitch_0
    iget-byte v0, p0, Lza1;->h0:B

    .line 87
    .line 88
    sget-object v8, Ldn8;->a:Ldn8;

    .line 89
    .line 90
    if-eqz v0, :cond_9

    .line 91
    .line 92
    if-eq v0, v6, :cond_8

    .line 93
    .line 94
    if-ne v0, v7, :cond_7

    .line 95
    .line 96
    invoke-static {p1}, Lw39;->n0(Ljava/lang/Object;)V

    .line 97
    .line 98
    .line 99
    :cond_6
    move-object v2, v8

    .line 100
    goto :goto_8

    .line 101
    :cond_7
    invoke-static {v3}, Lbt;->i(Ljava/lang/String;)V

    .line 102
    .line 103
    .line 104
    goto :goto_8

    .line 105
    :cond_8
    invoke-static {p1}, Lw39;->n0(Ljava/lang/Object;)V

    .line 106
    .line 107
    .line 108
    goto :goto_6

    .line 109
    :cond_9
    invoke-static {p1}, Lw39;->n0(Ljava/lang/Object;)V

    .line 110
    .line 111
    .line 112
    iget-object p1, v5, Lib1;->k0:Lz47;

    .line 113
    .line 114
    iput-byte v6, p0, Lza1;->h0:B

    .line 115
    .line 116
    iget-object p1, p1, Lz47;->Z:Ljava/lang/Object;

    .line 117
    .line 118
    check-cast p1, Lux0;

    .line 119
    .line 120
    invoke-virtual {p1, p0}, Lrm3;->h(Lq51;)Ljava/lang/Object;

    .line 121
    .line 122
    .line 123
    move-result-object p1

    .line 124
    if-ne p1, v4, :cond_a

    .line 125
    .line 126
    goto :goto_5

    .line 127
    :cond_a
    move-object p1, v8

    .line 128
    :goto_5
    if-ne p1, v4, :cond_b

    .line 129
    .line 130
    goto :goto_7

    .line 131
    :cond_b
    :goto_6
    invoke-virtual {v5}, Lib1;->b()Lja7;

    .line 132
    .line 133
    .line 134
    move-result-object p1

    .line 135
    iget-object p1, p1, Lja7;->c:Lj31;

    .line 136
    .line 137
    invoke-static {p1, v1}, Lzc1;->o(Lxe2;I)Lxe2;

    .line 138
    .line 139
    .line 140
    move-result-object p1

    .line 141
    new-instance v0, Lmh;

    .line 142
    .line 143
    const/4 v1, 0x3

    .line 144
    invoke-direct {v0, v5, v1}, Lmh;-><init>(Ljava/lang/Object;B)V

    .line 145
    .line 146
    .line 147
    iput-byte v7, p0, Lza1;->h0:B

    .line 148
    .line 149
    invoke-interface {p1, v0, p0}, Lxe2;->a(Lze2;Lq51;)Ljava/lang/Object;

    .line 150
    .line 151
    .line 152
    move-result-object p0

    .line 153
    if-ne p0, v4, :cond_6

    .line 154
    .line 155
    :goto_7
    move-object v2, v4

    .line 156
    :goto_8
    return-object v2

    .line 157
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
