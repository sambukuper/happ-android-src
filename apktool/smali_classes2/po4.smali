.class public final Lpo4;
.super Luy7;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Lrn2;


# instance fields
.field public final synthetic g0:B

.field public h0:Z

.field public final synthetic i0:Lsu/happ/proxyutility/feature/main/MainViewModel;

.field public final synthetic j0:Z

.field public final synthetic k0:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lsu/happ/proxyutility/feature/main/MainViewModel;Ljava/lang/String;ZLq51;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-byte v0, p0, Lpo4;->g0:B

    .line 3
    .line 4
    iput-object p1, p0, Lpo4;->i0:Lsu/happ/proxyutility/feature/main/MainViewModel;

    .line 5
    .line 6
    iput-object p2, p0, Lpo4;->k0:Ljava/lang/String;

    .line 7
    .line 8
    iput-boolean p3, p0, Lpo4;->j0:Z

    .line 9
    .line 10
    const/4 p1, 0x2

    .line 11
    invoke-direct {p0, p1, p4}, Luy7;-><init>(ILq51;)V

    .line 12
    .line 13
    .line 14
    return-void
.end method

.method public constructor <init>(Lsu/happ/proxyutility/feature/main/MainViewModel;ZLjava/lang/String;Lq51;)V
    .locals 1

    const/4 v0, 0x1

    iput-byte v0, p0, Lpo4;->g0:B

    .line 15
    iput-object p1, p0, Lpo4;->i0:Lsu/happ/proxyutility/feature/main/MainViewModel;

    iput-boolean p2, p0, Lpo4;->j0:Z

    iput-object p3, p0, Lpo4;->k0:Ljava/lang/String;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p4}, Luy7;-><init>(ILq51;)V

    return-void
.end method


# virtual methods
.method public final K(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    iget-byte v0, p0, Lpo4;->g0:B

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
    invoke-virtual {p0, p2, p1}, Lpo4;->n(Lq51;Ljava/lang/Object;)Lq51;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    check-cast p0, Lpo4;

    .line 17
    .line 18
    invoke-virtual {p0, v1}, Lpo4;->q(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0

    .line 23
    :pswitch_0
    invoke-virtual {p0, p2, p1}, Lpo4;->n(Lq51;Ljava/lang/Object;)Lq51;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    check-cast p0, Lpo4;

    .line 28
    .line 29
    invoke-virtual {p0, v1}, Lpo4;->q(Ljava/lang/Object;)Ljava/lang/Object;

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
    .locals 2

    .line 1
    iget-byte p2, p0, Lpo4;->g0:B

    .line 2
    .line 3
    iget-object v0, p0, Lpo4;->k0:Ljava/lang/String;

    .line 4
    .line 5
    iget-boolean v1, p0, Lpo4;->j0:Z

    .line 6
    .line 7
    iget-object p0, p0, Lpo4;->i0:Lsu/happ/proxyutility/feature/main/MainViewModel;

    .line 8
    .line 9
    packed-switch p2, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    new-instance p2, Lpo4;

    .line 13
    .line 14
    invoke-direct {p2, p0, v1, v0, p1}, Lpo4;-><init>(Lsu/happ/proxyutility/feature/main/MainViewModel;ZLjava/lang/String;Lq51;)V

    .line 15
    .line 16
    .line 17
    return-object p2

    .line 18
    :pswitch_0
    new-instance p2, Lpo4;

    .line 19
    .line 20
    invoke-direct {p2, p0, v0, v1, p1}, Lpo4;-><init>(Lsu/happ/proxyutility/feature/main/MainViewModel;Ljava/lang/String;ZLq51;)V

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
    .locals 15

    .line 1
    iget-byte v0, p0, Lpo4;->g0:B

    .line 2
    .line 3
    sget-object v13, Ldn8;->a:Ldn8;

    .line 4
    .line 5
    iget-boolean v1, p0, Lpo4;->j0:Z

    .line 6
    .line 7
    iget-object v2, p0, Lpo4;->i0:Lsu/happ/proxyutility/feature/main/MainViewModel;

    .line 8
    .line 9
    const-string v3, "call to \'resume\' before \'invoke\' with coroutine"

    .line 10
    .line 11
    sget-object v14, Lc71;->X:Lc71;

    .line 12
    .line 13
    const/4 v4, 0x1

    .line 14
    const/4 v5, 0x0

    .line 15
    packed-switch v0, :pswitch_data_0

    .line 16
    .line 17
    .line 18
    iget-boolean v0, p0, Lpo4;->h0:Z

    .line 19
    .line 20
    if-eqz v0, :cond_1

    .line 21
    .line 22
    if-ne v0, v4, :cond_0

    .line 23
    .line 24
    invoke-static/range {p1 .. p1}, Lw39;->n0(Ljava/lang/Object;)V

    .line 25
    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_0
    invoke-static {v3}, Lbt;->i(Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    move-object v13, v5

    .line 32
    goto :goto_0

    .line 33
    :cond_1
    invoke-static/range {p1 .. p1}, Lw39;->n0(Ljava/lang/Object;)V

    .line 34
    .line 35
    .line 36
    iput-boolean v4, p0, Lpo4;->h0:Z

    .line 37
    .line 38
    iget-object v0, p0, Lpo4;->k0:Ljava/lang/String;

    .line 39
    .line 40
    invoke-virtual {v2, p0, v0, v1}, Lsu/happ/proxyutility/feature/main/MainViewModel;->D(Ls51;Ljava/lang/String;Z)Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    if-ne v0, v14, :cond_2

    .line 45
    .line 46
    move-object v13, v14

    .line 47
    :cond_2
    :goto_0
    return-object v13

    .line 48
    :pswitch_0
    iget-boolean v0, p0, Lpo4;->h0:Z

    .line 49
    .line 50
    if-eqz v0, :cond_4

    .line 51
    .line 52
    if-ne v0, v4, :cond_3

    .line 53
    .line 54
    invoke-static/range {p1 .. p1}, Lw39;->n0(Ljava/lang/Object;)V

    .line 55
    .line 56
    .line 57
    goto :goto_2

    .line 58
    :cond_3
    invoke-static {v3}, Lbt;->i(Ljava/lang/String;)V

    .line 59
    .line 60
    .line 61
    move-object v13, v5

    .line 62
    goto :goto_2

    .line 63
    :cond_4
    invoke-static/range {p1 .. p1}, Lw39;->n0(Ljava/lang/Object;)V

    .line 64
    .line 65
    .line 66
    iput-boolean v4, p0, Lpo4;->h0:Z

    .line 67
    .line 68
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 69
    .line 70
    .line 71
    sget-object v0, Lsu/happ/proxyutility/HappApplication;->M0:Lsu/happ/proxyutility/HappApplication;

    .line 72
    .line 73
    invoke-static {}, Lk32;->i()Lsu/happ/proxyutility/HappApplication;

    .line 74
    .line 75
    .line 76
    move-result-object v0

    .line 77
    iget-object v0, v0, Lsu/happ/proxyutility/HappApplication;->L0:Lu5;

    .line 78
    .line 79
    iget-object v0, v0, Lu5;->Y:Ljava/lang/Object;

    .line 80
    .line 81
    check-cast v0, Landroid/app/Activity;

    .line 82
    .line 83
    if-eqz v0, :cond_6

    .line 84
    .line 85
    instance-of v3, v0, Lsu/happ/proxyutility/feature/main/MainActivity;

    .line 86
    .line 87
    if-eqz v3, :cond_5

    .line 88
    .line 89
    move-object v5, v0

    .line 90
    check-cast v5, Lsu/happ/proxyutility/feature/main/MainActivity;

    .line 91
    .line 92
    :cond_5
    move-object v0, v5

    .line 93
    if-eqz v0, :cond_6

    .line 94
    .line 95
    const/4 v3, 0x0

    .line 96
    const/4 v4, 0x3

    .line 97
    invoke-static {v2, v3, v4}, Lsu/happ/proxyutility/feature/main/MainViewModel;->C(Lsu/happ/proxyutility/feature/main/MainViewModel;ZI)V

    .line 98
    .line 99
    .line 100
    if-eqz v1, :cond_6

    .line 101
    .line 102
    sget-object v1, Lkw4;->a:Lkw4;

    .line 103
    .line 104
    iget-object v1, p0, Lpo4;->k0:Ljava/lang/String;

    .line 105
    .line 106
    invoke-static {v1}, Lkw4;->f(Ljava/lang/String;)Lsu/happ/proxyutility/dto/SubscriptionItem;

    .line 107
    .line 108
    .line 109
    move-result-object v2

    .line 110
    if-eqz v2, :cond_6

    .line 111
    .line 112
    invoke-static {}, Lk32;->i()Lsu/happ/proxyutility/HappApplication;

    .line 113
    .line 114
    .line 115
    move-result-object v3

    .line 116
    invoke-virtual {v3}, Lsu/happ/proxyutility/HappApplication;->d()Lkf4;

    .line 117
    .line 118
    .line 119
    move-result-object v3

    .line 120
    new-instance v4, Luq0;

    .line 121
    .line 122
    const/16 v5, 0xd

    .line 123
    .line 124
    invoke-direct {v4, v2, v5}, Luq0;-><init>(Lsu/happ/proxyutility/dto/SubscriptionItem;B)V

    .line 125
    .line 126
    .line 127
    invoke-virtual {v3, v4}, Lkf4;->h(Lgn2;)V

    .line 128
    .line 129
    .line 130
    const/4 v10, 0x0

    .line 131
    const/16 v12, 0x3f0

    .line 132
    .line 133
    const/4 v3, 0x0

    .line 134
    const/4 v4, 0x0

    .line 135
    const/4 v5, 0x0

    .line 136
    const/4 v6, 0x0

    .line 137
    const/4 v7, 0x0

    .line 138
    const/4 v8, 0x0

    .line 139
    const/4 v9, 0x0

    .line 140
    move-object v11, p0

    .line 141
    invoke-static/range {v0 .. v12}, Lsu/happ/proxyutility/feature/main/MainActivity;->P(Lsu/happ/proxyutility/feature/main/MainActivity;Ljava/lang/String;Lsu/happ/proxyutility/dto/SubscriptionItem;ZZZLjava/lang/String;ZZLjava/lang/Boolean;Lg83;Ls51;I)Ljava/lang/Object;

    .line 142
    .line 143
    .line 144
    move-result-object v0

    .line 145
    if-ne v0, v14, :cond_6

    .line 146
    .line 147
    goto :goto_1

    .line 148
    :cond_6
    move-object v0, v13

    .line 149
    :goto_1
    if-ne v0, v14, :cond_7

    .line 150
    .line 151
    move-object v13, v14

    .line 152
    :cond_7
    :goto_2
    return-object v13

    .line 153
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
