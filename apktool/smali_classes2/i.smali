.class public final synthetic Li;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Ldn2;


# instance fields
.field public final synthetic X:B

.field public final synthetic Y:Lsu/happ/proxyutility/feature/about_settings/AboutSettingsActivity;


# direct methods
.method public synthetic constructor <init>(Lsu/happ/proxyutility/feature/about_settings/AboutSettingsActivity;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, Li;->X:B

    .line 2
    .line 3
    iput-object p1, p0, Li;->Y:Lsu/happ/proxyutility/feature/about_settings/AboutSettingsActivity;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 2

    .line 1
    iget-byte v0, p0, Li;->X:B

    .line 2
    .line 3
    sget-object v1, Ldn8;->a:Ldn8;

    .line 4
    .line 5
    iget-object p0, p0, Li;->Y:Lsu/happ/proxyutility/feature/about_settings/AboutSettingsActivity;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    new-instance v0, Ls;

    .line 11
    .line 12
    iget-object p0, p0, Lsu/happ/proxyutility/feature/about_settings/AboutSettingsActivity;->Q0:Lt5;

    .line 13
    .line 14
    if-eqz p0, :cond_0

    .line 15
    .line 16
    invoke-direct {v0, p0}, Ls;-><init>(Lt5;)V

    .line 17
    .line 18
    .line 19
    return-object v0

    .line 20
    :cond_0
    const-string p0, "binding"

    .line 21
    .line 22
    invoke-static {p0}, Ldh3;->T(Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    const/4 p0, 0x0

    .line 26
    throw p0

    .line 27
    :pswitch_0
    sget v0, Lsu/happ/proxyutility/feature/about_settings/AboutSettingsActivity;->T0:I

    .line 28
    .line 29
    sget-object v0, Lss8;->a:Lss8;

    .line 30
    .line 31
    const-string v0, "https://www.happ.su/main/privacy-policy"

    .line 32
    .line 33
    invoke-static {p0, v0}, Lss8;->B(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    return-object v1

    .line 37
    :pswitch_1
    sget v0, Lsu/happ/proxyutility/feature/about_settings/AboutSettingsActivity;->T0:I

    .line 38
    .line 39
    sget-object v0, Lss8;->a:Lss8;

    .line 40
    .line 41
    const-string v0, "https://www.happ.su/main/third-party-libraries"

    .line 42
    .line 43
    invoke-static {p0, v0}, Lss8;->B(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    return-object v1

    .line 47
    :pswitch_2
    sget v0, Lsu/happ/proxyutility/feature/about_settings/AboutSettingsActivity;->T0:I

    .line 48
    .line 49
    sget-object v0, Lss8;->a:Lss8;

    .line 50
    .line 51
    const-string v0, "https://www.happ.su/main/terms-of-services"

    .line 52
    .line 53
    invoke-static {p0, v0}, Lss8;->B(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/Object;

    .line 54
    .line 55
    .line 56
    return-object v1

    .line 57
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
