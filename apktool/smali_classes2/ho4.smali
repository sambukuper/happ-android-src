.class public final Lho4;
.super Luy7;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Lrn2;


# instance fields
.field public final synthetic g0:B

.field public h0:B

.field public final synthetic i0:Lsu/happ/proxyutility/feature/main/MainViewModel;


# direct methods
.method public synthetic constructor <init>(Lsu/happ/proxyutility/feature/main/MainViewModel;Lq51;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, Lho4;->g0:B

    .line 2
    .line 3
    iput-object p1, p0, Lho4;->i0:Lsu/happ/proxyutility/feature/main/MainViewModel;

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
    iget-byte v0, p0, Lho4;->g0:B

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
    invoke-virtual {p0, p2, p1}, Lho4;->n(Lq51;Ljava/lang/Object;)Lq51;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    check-cast p0, Lho4;

    .line 17
    .line 18
    invoke-virtual {p0, v1}, Lho4;->q(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0

    .line 23
    :pswitch_0
    invoke-virtual {p0, p2, p1}, Lho4;->n(Lq51;Ljava/lang/Object;)Lq51;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    check-cast p0, Lho4;

    .line 28
    .line 29
    invoke-virtual {p0, v1}, Lho4;->q(Ljava/lang/Object;)Ljava/lang/Object;

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
    iget-byte p2, p0, Lho4;->g0:B

    .line 2
    .line 3
    iget-object p0, p0, Lho4;->i0:Lsu/happ/proxyutility/feature/main/MainViewModel;

    .line 4
    .line 5
    packed-switch p2, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    new-instance p2, Lho4;

    .line 9
    .line 10
    const/4 v0, 0x1

    .line 11
    invoke-direct {p2, p0, p1, v0}, Lho4;-><init>(Lsu/happ/proxyutility/feature/main/MainViewModel;Lq51;B)V

    .line 12
    .line 13
    .line 14
    return-object p2

    .line 15
    :pswitch_0
    new-instance p2, Lho4;

    .line 16
    .line 17
    const/4 v0, 0x0

    .line 18
    invoke-direct {p2, p0, p1, v0}, Lho4;-><init>(Lsu/happ/proxyutility/feature/main/MainViewModel;Lq51;B)V

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
    iget-byte v0, p0, Lho4;->g0:B

    .line 2
    .line 3
    sget-object v1, Ldn8;->a:Ldn8;

    .line 4
    .line 5
    iget-object v2, p0, Lho4;->i0:Lsu/happ/proxyutility/feature/main/MainViewModel;

    .line 6
    .line 7
    const/4 v3, 0x0

    .line 8
    const-string v4, "call to \'resume\' before \'invoke\' with coroutine"

    .line 9
    .line 10
    sget-object v5, Lc71;->X:Lc71;

    .line 11
    .line 12
    const/4 v6, 0x1

    .line 13
    const/4 v7, 0x2

    .line 14
    packed-switch v0, :pswitch_data_0

    .line 15
    .line 16
    .line 17
    iget-byte v0, p0, Lho4;->h0:B

    .line 18
    .line 19
    if-eqz v0, :cond_2

    .line 20
    .line 21
    if-eq v0, v6, :cond_1

    .line 22
    .line 23
    if-ne v0, v7, :cond_0

    .line 24
    .line 25
    invoke-static {p1}, Lw39;->n0(Ljava/lang/Object;)V

    .line 26
    .line 27
    .line 28
    goto :goto_2

    .line 29
    :cond_0
    invoke-static {v4}, Lbt;->i(Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    move-object v1, v3

    .line 33
    goto :goto_2

    .line 34
    :cond_1
    invoke-static {p1}, Lw39;->n0(Ljava/lang/Object;)V

    .line 35
    .line 36
    .line 37
    goto :goto_0

    .line 38
    :cond_2
    invoke-static {p1}, Lw39;->n0(Ljava/lang/Object;)V

    .line 39
    .line 40
    .line 41
    sget-object p1, Lgx1;->Y:Lbe;

    .line 42
    .line 43
    const-wide/16 v3, 0xbb8

    .line 44
    .line 45
    sget-object p1, Llx1;->Z:Llx1;

    .line 46
    .line 47
    invoke-static {v3, v4, p1}, Lvj8;->m0(JLlx1;)J

    .line 48
    .line 49
    .line 50
    move-result-wide v3

    .line 51
    iput-byte v6, p0, Lho4;->h0:B

    .line 52
    .line 53
    invoke-static {v3, v4, p0}, Lu70;->G(JLq51;)Ljava/lang/Object;

    .line 54
    .line 55
    .line 56
    move-result-object p1

    .line 57
    if-ne p1, v5, :cond_3

    .line 58
    .line 59
    goto :goto_1

    .line 60
    :cond_3
    :goto_0
    iput-byte v7, p0, Lho4;->h0:B

    .line 61
    .line 62
    invoke-virtual {v2, p0}, Lsu/happ/proxyutility/feature/main/MainViewModel;->i(Ls51;)Ljava/lang/Object;

    .line 63
    .line 64
    .line 65
    move-result-object p0

    .line 66
    if-ne p0, v5, :cond_4

    .line 67
    .line 68
    :goto_1
    move-object v1, v5

    .line 69
    :cond_4
    :goto_2
    return-object v1

    .line 70
    :pswitch_0
    iget-byte v0, p0, Lho4;->h0:B

    .line 71
    .line 72
    const/4 v8, 0x3

    .line 73
    if-eqz v0, :cond_8

    .line 74
    .line 75
    if-eq v0, v6, :cond_7

    .line 76
    .line 77
    if-eq v0, v7, :cond_6

    .line 78
    .line 79
    if-ne v0, v8, :cond_5

    .line 80
    .line 81
    invoke-static {p1}, Lw39;->n0(Ljava/lang/Object;)V

    .line 82
    .line 83
    .line 84
    goto :goto_8

    .line 85
    :cond_5
    invoke-static {v4}, Lbt;->i(Ljava/lang/String;)V

    .line 86
    .line 87
    .line 88
    move-object v1, v3

    .line 89
    goto :goto_8

    .line 90
    :cond_6
    invoke-static {p1}, Lw39;->n0(Ljava/lang/Object;)V

    .line 91
    .line 92
    .line 93
    goto :goto_4

    .line 94
    :cond_7
    invoke-static {p1}, Lw39;->n0(Ljava/lang/Object;)V

    .line 95
    .line 96
    .line 97
    check-cast p1, Lsj6;

    .line 98
    .line 99
    iget-object p1, p1, Lsj6;->X:Ljava/lang/Object;

    .line 100
    .line 101
    goto :goto_3

    .line 102
    :cond_8
    invoke-static {p1}, Lw39;->n0(Ljava/lang/Object;)V

    .line 103
    .line 104
    .line 105
    sget-object p1, Lsu/happ/proxyutility/HappApplication;->M0:Lsu/happ/proxyutility/HappApplication;

    .line 106
    .line 107
    invoke-static {}, Lk32;->i()Lsu/happ/proxyutility/HappApplication;

    .line 108
    .line 109
    .line 110
    move-result-object p1

    .line 111
    iget-object p1, p1, Lsu/happ/proxyutility/HappApplication;->w0:Lvz7;

    .line 112
    .line 113
    invoke-virtual {p1}, Lvz7;->getValue()Ljava/lang/Object;

    .line 114
    .line 115
    .line 116
    move-result-object p1

    .line 117
    check-cast p1, Lp72;

    .line 118
    .line 119
    iput-byte v6, p0, Lho4;->h0:B

    .line 120
    .line 121
    invoke-virtual {p1, p0}, Lp72;->b(Ls51;)Ljava/lang/Object;

    .line 122
    .line 123
    .line 124
    move-result-object p1

    .line 125
    if-ne p1, v5, :cond_9

    .line 126
    .line 127
    goto :goto_7

    .line 128
    :cond_9
    :goto_3
    iput-byte v7, p0, Lho4;->h0:B

    .line 129
    .line 130
    sget-object p1, Ltn;->Y:Ltn;

    .line 131
    .line 132
    invoke-virtual {v2, p1, p0}, Lsu/happ/proxyutility/feature/main/MainViewModel;->k(Ltn;Luy7;)Ljava/lang/Object;

    .line 133
    .line 134
    .line 135
    move-result-object p1

    .line 136
    if-ne p1, v5, :cond_a

    .line 137
    .line 138
    goto :goto_7

    .line 139
    :cond_a
    :goto_4
    iput-byte v8, p0, Lho4;->h0:B

    .line 140
    .line 141
    iget-object p1, v2, Lsu/happ/proxyutility/feature/main/MainViewModel;->e:Lvz7;

    .line 142
    .line 143
    invoke-virtual {p1}, Lvz7;->getValue()Ljava/lang/Object;

    .line 144
    .line 145
    .line 146
    move-result-object p1

    .line 147
    check-cast p1, Lqq0;

    .line 148
    .line 149
    iget-object p1, p1, Lqq0;->b:Lvz7;

    .line 150
    .line 151
    invoke-virtual {p1}, Lvz7;->getValue()Ljava/lang/Object;

    .line 152
    .line 153
    .line 154
    move-result-object p1

    .line 155
    check-cast p1, Lar0;

    .line 156
    .line 157
    invoke-virtual {p1, p0}, Lar0;->a(Ls51;)Ljava/lang/Object;

    .line 158
    .line 159
    .line 160
    move-result-object p0

    .line 161
    if-ne p0, v5, :cond_b

    .line 162
    .line 163
    goto :goto_5

    .line 164
    :cond_b
    move-object p0, v1

    .line 165
    :goto_5
    if-ne p0, v5, :cond_c

    .line 166
    .line 167
    goto :goto_6

    .line 168
    :cond_c
    move-object p0, v1

    .line 169
    :goto_6
    if-ne p0, v5, :cond_d

    .line 170
    .line 171
    :goto_7
    move-object v1, v5

    .line 172
    :cond_d
    :goto_8
    return-object v1

    .line 173
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
