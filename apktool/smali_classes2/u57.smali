.class public final synthetic Lu57;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Lrn2;


# instance fields
.field public final synthetic X:B

.field public final synthetic Y:Lsu/happ/proxyutility/feature/settings/SettingsActivity;


# direct methods
.method public synthetic constructor <init>(Lsu/happ/proxyutility/feature/settings/SettingsActivity;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, Lu57;->X:B

    .line 2
    .line 3
    iput-object p1, p0, Lu57;->Y:Lsu/happ/proxyutility/feature/settings/SettingsActivity;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final K(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    .line 1
    iget-byte v0, p0, Lu57;->X:B

    .line 2
    .line 3
    sget-object v1, Ldn8;->a:Ldn8;

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    const/4 v3, 0x2

    .line 7
    iget-object p0, p0, Lu57;->Y:Lsu/happ/proxyutility/feature/settings/SettingsActivity;

    .line 8
    .line 9
    const/4 v4, 0x1

    .line 10
    check-cast p1, Llp2;

    .line 11
    .line 12
    check-cast p2, Ljava/lang/Integer;

    .line 13
    .line 14
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 15
    .line 16
    .line 17
    move-result p2

    .line 18
    packed-switch v0, :pswitch_data_0

    .line 19
    .line 20
    .line 21
    sget v0, Lsu/happ/proxyutility/feature/settings/SettingsActivity;->e1:I

    .line 22
    .line 23
    and-int/lit8 v0, p2, 0x3

    .line 24
    .line 25
    if-eq v0, v3, :cond_0

    .line 26
    .line 27
    move v2, v4

    .line 28
    :cond_0
    and-int/2addr p2, v4

    .line 29
    invoke-virtual {p1, p2, v2}, Llp2;->N(IZ)Z

    .line 30
    .line 31
    .line 32
    move-result p2

    .line 33
    if-eqz p2, :cond_1

    .line 34
    .line 35
    iget-object p2, p0, Lsu/happ/proxyutility/feature/settings/SettingsActivity;->W0:Ly5;

    .line 36
    .line 37
    invoke-virtual {p2}, Ly5;->getValue()Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object p2

    .line 41
    check-cast p2, Lp67;

    .line 42
    .line 43
    iget-object p0, p0, Lsu/happ/proxyutility/feature/settings/SettingsActivity;->X0:Ly5;

    .line 44
    .line 45
    invoke-virtual {p0}, Ly5;->getValue()Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    move-result-object p0

    .line 49
    check-cast p0, Lza3;

    .line 50
    .line 51
    const/16 v0, 0x48

    .line 52
    .line 53
    invoke-static {p2, p0, p1, v0}, Ljb5;->f(Lp67;Lza3;Llp2;I)V

    .line 54
    .line 55
    .line 56
    goto :goto_0

    .line 57
    :cond_1
    invoke-virtual {p1}, Llp2;->Q()V

    .line 58
    .line 59
    .line 60
    :goto_0
    return-object v1

    .line 61
    :pswitch_0
    sget v0, Lsu/happ/proxyutility/feature/settings/SettingsActivity;->e1:I

    .line 62
    .line 63
    and-int/lit8 v0, p2, 0x3

    .line 64
    .line 65
    if-eq v0, v3, :cond_2

    .line 66
    .line 67
    move v2, v4

    .line 68
    :cond_2
    and-int/2addr p2, v4

    .line 69
    invoke-virtual {p1, p2, v2}, Llp2;->N(IZ)Z

    .line 70
    .line 71
    .line 72
    move-result p2

    .line 73
    if-eqz p2, :cond_3

    .line 74
    .line 75
    new-instance p2, Lu57;

    .line 76
    .line 77
    invoke-direct {p2, p0, v4}, Lu57;-><init>(Lsu/happ/proxyutility/feature/settings/SettingsActivity;B)V

    .line 78
    .line 79
    .line 80
    const p0, -0x9950a53

    .line 81
    .line 82
    .line 83
    invoke-static {p0, p2, p1}, Ljm4;->U(ILon2;Llp2;)Lzy0;

    .line 84
    .line 85
    .line 86
    move-result-object p0

    .line 87
    const/4 p2, 0x6

    .line 88
    invoke-static {p0, p1, p2}, Li21;->a(Lzy0;Llp2;I)V

    .line 89
    .line 90
    .line 91
    goto :goto_1

    .line 92
    :cond_3
    invoke-virtual {p1}, Llp2;->Q()V

    .line 93
    .line 94
    .line 95
    :goto_1
    return-object v1

    .line 96
    nop

    .line 97
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
