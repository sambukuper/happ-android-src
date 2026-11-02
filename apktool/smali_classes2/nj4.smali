.class public final synthetic Lnj4;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Lj6;
.implements Lfa5;


# instance fields
.field public final synthetic X:B

.field public final synthetic Y:Lsu/happ/proxyutility/feature/main/MainActivity;


# direct methods
.method public synthetic constructor <init>(Lsu/happ/proxyutility/feature/main/MainActivity;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, Lnj4;->X:B

    .line 2
    .line 3
    iput-object p1, p0, Lnj4;->Y:Lsu/happ/proxyutility/feature/main/MainActivity;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public c(Ljava/lang/Object;)V
    .locals 5

    .line 1
    iget-byte v0, p0, Lnj4;->X:B

    .line 2
    .line 3
    const/4 v1, 0x3

    .line 4
    const/4 v2, 0x0

    .line 5
    const/4 v3, -0x1

    .line 6
    iget-object p0, p0, Lnj4;->Y:Lsu/happ/proxyutility/feature/main/MainActivity;

    .line 7
    .line 8
    check-cast p1, Li6;

    .line 9
    .line 10
    packed-switch v0, :pswitch_data_0

    .line 11
    .line 12
    .line 13
    sget v0, Lsu/happ/proxyutility/feature/main/MainActivity;->y1:I

    .line 14
    .line 15
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 16
    .line 17
    .line 18
    iget v0, p1, Li6;->X:I

    .line 19
    .line 20
    if-ne v0, v3, :cond_1

    .line 21
    .line 22
    iget-object p1, p1, Li6;->Y:Landroid/content/Intent;

    .line 23
    .line 24
    if-eqz p1, :cond_1

    .line 25
    .line 26
    const-string v0, "SCAN_RESULT"

    .line 27
    .line 28
    invoke-virtual {p1, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    if-eqz p1, :cond_1

    .line 33
    .line 34
    sget-object v0, Lcm4;->a:Lkc6;

    .line 35
    .line 36
    invoke-virtual {v0, p1}, Lkc6;->d(Ljava/lang/CharSequence;)Z

    .line 37
    .line 38
    .line 39
    move-result v0

    .line 40
    if-eqz v0, :cond_0

    .line 41
    .line 42
    sget-object v0, Lss8;->a:Lss8;

    .line 43
    .line 44
    invoke-static {p0, p1}, Lss8;->B(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    goto :goto_0

    .line 48
    :cond_0
    invoke-virtual {p0}, Landroidx/activity/ComponentActivity;->h()Lg94;

    .line 49
    .line 50
    .line 51
    move-result-object v0

    .line 52
    invoke-static {v0}, Lys0;->z(Lg94;)Lu84;

    .line 53
    .line 54
    .line 55
    move-result-object v0

    .line 56
    sget-object v1, Ltp1;->a:Lnf1;

    .line 57
    .line 58
    sget-object v1, Lye1;->Z:Lye1;

    .line 59
    .line 60
    new-instance v3, Lfk4;

    .line 61
    .line 62
    const/4 v4, 0x5

    .line 63
    invoke-direct {v3, p0, p1, v2, v4}, Lfk4;-><init>(Lsu/happ/proxyutility/feature/main/MainActivity;Ljava/lang/String;Lq51;B)V

    .line 64
    .line 65
    .line 66
    const/4 p0, 0x2

    .line 67
    invoke-static {v0, v1, v3, p0}, Ljm4;->Q(Lb71;Lu61;Lrn2;I)Log7;

    .line 68
    .line 69
    .line 70
    :cond_1
    :goto_0
    return-void

    .line 71
    :pswitch_0
    sget v0, Lsu/happ/proxyutility/feature/main/MainActivity;->y1:I

    .line 72
    .line 73
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 74
    .line 75
    .line 76
    iget p1, p1, Li6;->X:I

    .line 77
    .line 78
    if-ne p1, v3, :cond_2

    .line 79
    .line 80
    invoke-virtual {p0}, Landroidx/activity/ComponentActivity;->h()Lg94;

    .line 81
    .line 82
    .line 83
    move-result-object p1

    .line 84
    invoke-static {p1}, Lys0;->z(Lg94;)Lu84;

    .line 85
    .line 86
    .line 87
    move-result-object p1

    .line 88
    new-instance v0, Ly9;

    .line 89
    .line 90
    const/16 v3, 0x9

    .line 91
    .line 92
    invoke-direct {v0, p0, v2, v3}, Ly9;-><init>(Ljava/lang/Object;Lq51;B)V

    .line 93
    .line 94
    .line 95
    invoke-static {p1, v2, v0, v1}, Ljm4;->Q(Lb71;Lu61;Lrn2;I)Log7;

    .line 96
    .line 97
    .line 98
    :cond_2
    return-void

    .line 99
    :pswitch_1
    sget v0, Lsu/happ/proxyutility/feature/main/MainActivity;->y1:I

    .line 100
    .line 101
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 102
    .line 103
    .line 104
    iget p1, p1, Li6;->X:I

    .line 105
    .line 106
    if-ne p1, v3, :cond_3

    .line 107
    .line 108
    invoke-virtual {p0}, Landroidx/activity/ComponentActivity;->h()Lg94;

    .line 109
    .line 110
    .line 111
    move-result-object p1

    .line 112
    invoke-static {p1}, Lys0;->z(Lg94;)Lu84;

    .line 113
    .line 114
    .line 115
    move-result-object p1

    .line 116
    new-instance v0, Ljy2;

    .line 117
    .line 118
    const/16 v3, 0xb

    .line 119
    .line 120
    invoke-direct {v0, p0, v2, v3}, Ljy2;-><init>(Ljava/lang/Object;Lq51;B)V

    .line 121
    .line 122
    .line 123
    invoke-static {p1, v2, v0, v1}, Ljm4;->Q(Lb71;Lu61;Lrn2;I)Log7;

    .line 124
    .line 125
    .line 126
    :cond_3
    return-void

    .line 127
    :pswitch_2
    sget v0, Lsu/happ/proxyutility/feature/main/MainActivity;->y1:I

    .line 128
    .line 129
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 130
    .line 131
    .line 132
    iget p1, p1, Li6;->X:I

    .line 133
    .line 134
    if-ne p1, v3, :cond_4

    .line 135
    .line 136
    invoke-virtual {p0}, Lsu/happ/proxyutility/feature/main/MainActivity;->i0()V

    .line 137
    .line 138
    .line 139
    :cond_4
    return-void

    .line 140
    nop

    .line 141
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public i(Lfb9;)V
    .locals 4

    .line 1
    sget-object v0, Lsu/happ/proxyutility/HappApplication;->N0:Lm51;

    .line 2
    .line 3
    new-instance v1, Lbv;

    .line 4
    .line 5
    const/4 v2, 0x7

    .line 6
    iget-object p0, p0, Lnj4;->Y:Lsu/happ/proxyutility/feature/main/MainActivity;

    .line 7
    .line 8
    const/4 v3, 0x0

    .line 9
    invoke-direct {v1, p1, p0, v3, v2}, Lbv;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lq51;B)V

    .line 10
    .line 11
    .line 12
    const/4 p0, 0x3

    .line 13
    invoke-static {v0, v3, v1, p0}, Ljm4;->Q(Lb71;Lu61;Lrn2;I)Log7;

    .line 14
    .line 15
    .line 16
    return-void
.end method
