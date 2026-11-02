.class public final synthetic Lbu7;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Lrn2;


# instance fields
.field public final synthetic X:B

.field public final synthetic Y:Lsu/happ/proxyutility/feature/subscription_settings/SubscriptionSettingsActivity;


# direct methods
.method public synthetic constructor <init>(Lsu/happ/proxyutility/feature/subscription_settings/SubscriptionSettingsActivity;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, Lbu7;->X:B

    .line 2
    .line 3
    iput-object p1, p0, Lbu7;->Y:Lsu/happ/proxyutility/feature/subscription_settings/SubscriptionSettingsActivity;

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
    iget-byte v0, p0, Lbu7;->X:B

    .line 2
    .line 3
    sget-object v1, Ldn8;->a:Ldn8;

    .line 4
    .line 5
    const/4 v2, 0x2

    .line 6
    const/4 v3, 0x0

    .line 7
    iget-object p0, p0, Lbu7;->Y:Lsu/happ/proxyutility/feature/subscription_settings/SubscriptionSettingsActivity;

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
    sget v0, Lsu/happ/proxyutility/feature/subscription_settings/SubscriptionSettingsActivity;->z0:I

    .line 22
    .line 23
    and-int/lit8 v0, p2, 0x3

    .line 24
    .line 25
    if-eq v0, v2, :cond_0

    .line 26
    .line 27
    move v3, v4

    .line 28
    :cond_0
    and-int/2addr p2, v4

    .line 29
    invoke-virtual {p1, p2, v3}, Llp2;->N(IZ)Z

    .line 30
    .line 31
    .line 32
    move-result p2

    .line 33
    if-eqz p2, :cond_1

    .line 34
    .line 35
    iget-object p0, p0, Lsu/happ/proxyutility/feature/subscription_settings/SubscriptionSettingsActivity;->y0:Ly5;

    .line 36
    .line 37
    invoke-virtual {p0}, Ly5;->getValue()Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object p0

    .line 41
    check-cast p0, Lmu7;

    .line 42
    .line 43
    sget-object p2, Landroidx/compose/foundation/layout/b;->c:Landroidx/compose/foundation/layout/FillElement;

    .line 44
    .line 45
    const/16 v0, 0x38

    .line 46
    .line 47
    invoke-static {p0, p2, p1, v0}, Leu7;->b(Lmu7;Lkx4;Llp2;I)V

    .line 48
    .line 49
    .line 50
    goto :goto_0

    .line 51
    :cond_1
    invoke-virtual {p1}, Llp2;->Q()V

    .line 52
    .line 53
    .line 54
    :goto_0
    return-object v1

    .line 55
    :pswitch_0
    sget v0, Lsu/happ/proxyutility/feature/subscription_settings/SubscriptionSettingsActivity;->z0:I

    .line 56
    .line 57
    and-int/lit8 v0, p2, 0x3

    .line 58
    .line 59
    if-eq v0, v2, :cond_2

    .line 60
    .line 61
    move v3, v4

    .line 62
    :cond_2
    and-int/2addr p2, v4

    .line 63
    invoke-virtual {p1, p2, v3}, Llp2;->N(IZ)Z

    .line 64
    .line 65
    .line 66
    move-result p2

    .line 67
    if-eqz p2, :cond_3

    .line 68
    .line 69
    new-instance p2, Lbu7;

    .line 70
    .line 71
    invoke-direct {p2, p0, v4}, Lbu7;-><init>(Lsu/happ/proxyutility/feature/subscription_settings/SubscriptionSettingsActivity;B)V

    .line 72
    .line 73
    .line 74
    const p0, -0x1cdd296f

    .line 75
    .line 76
    .line 77
    invoke-static {p0, p2, p1}, Ljm4;->U(ILon2;Llp2;)Lzy0;

    .line 78
    .line 79
    .line 80
    move-result-object p0

    .line 81
    const/4 p2, 0x6

    .line 82
    invoke-static {p0, p1, p2}, Li21;->a(Lzy0;Llp2;I)V

    .line 83
    .line 84
    .line 85
    goto :goto_1

    .line 86
    :cond_3
    invoke-virtual {p1}, Llp2;->Q()V

    .line 87
    .line 88
    .line 89
    :goto_1
    return-object v1

    .line 90
    nop

    .line 91
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
