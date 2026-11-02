.class public final synthetic Lsp6;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Lgn2;


# instance fields
.field public final synthetic X:B

.field public final synthetic Y:Lsu/happ/proxyutility/feature/routing/settings/RoutingSettingsActivity;

.field public final synthetic Z:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(Lsu/happ/proxyutility/feature/routing/settings/RoutingSettingsActivity;Ljava/lang/String;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, Lsp6;->X:B

    .line 2
    .line 3
    iput-object p1, p0, Lsp6;->Y:Lsu/happ/proxyutility/feature/routing/settings/RoutingSettingsActivity;

    .line 4
    .line 5
    iput-object p2, p0, Lsp6;->Z:Ljava/lang/String;

    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final B(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    .line 1
    iget-byte v0, p0, Lsp6;->X:B

    .line 2
    .line 3
    sget-object v1, Ldn8;->a:Ldn8;

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    iget-object v3, p0, Lsp6;->Z:Ljava/lang/String;

    .line 7
    .line 8
    iget-object p0, p0, Lsp6;->Y:Lsu/happ/proxyutility/feature/routing/settings/RoutingSettingsActivity;

    .line 9
    .line 10
    packed-switch v0, :pswitch_data_0

    .line 11
    .line 12
    .line 13
    check-cast p1, Ljava/lang/Integer;

    .line 14
    .line 15
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 16
    .line 17
    .line 18
    move-result p1

    .line 19
    sget v0, Lsu/happ/proxyutility/feature/routing/settings/RoutingSettingsActivity;->T0:I

    .line 20
    .line 21
    iget-object p0, p0, Lsu/happ/proxyutility/feature/routing/settings/RoutingSettingsActivity;->R0:Lvz7;

    .line 22
    .line 23
    invoke-virtual {p0}, Lvz7;->getValue()Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    check-cast p0, Lmn6;

    .line 28
    .line 29
    new-instance v0, Lqb;

    .line 30
    .line 31
    const/4 v4, 0x7

    .line 32
    invoke-direct {v0, v4, p1}, Lqb;-><init>(BI)V

    .line 33
    .line 34
    .line 35
    sget-object p1, Lmn6;->j:Lvz7;

    .line 36
    .line 37
    invoke-virtual {p0, v3, v2, v0}, Lmn6;->D(Ljava/lang/String;Ljava/lang/String;Lgn2;)Lsu/happ/proxyutility/domain/routing/entity/RouteProfile;

    .line 38
    .line 39
    .line 40
    return-object v1

    .line 41
    :pswitch_0
    check-cast p1, Ljava/lang/Boolean;

    .line 42
    .line 43
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 44
    .line 45
    .line 46
    move-result p1

    .line 47
    sget v0, Lsu/happ/proxyutility/feature/routing/settings/RoutingSettingsActivity;->T0:I

    .line 48
    .line 49
    iget-object p0, p0, Lsu/happ/proxyutility/feature/routing/settings/RoutingSettingsActivity;->R0:Lvz7;

    .line 50
    .line 51
    invoke-virtual {p0}, Lvz7;->getValue()Ljava/lang/Object;

    .line 52
    .line 53
    .line 54
    move-result-object p0

    .line 55
    check-cast p0, Lmn6;

    .line 56
    .line 57
    new-instance v0, Las;

    .line 58
    .line 59
    const/4 v4, 0x3

    .line 60
    invoke-direct {v0, v4, p1}, Las;-><init>(BZ)V

    .line 61
    .line 62
    .line 63
    sget-object p1, Lmn6;->j:Lvz7;

    .line 64
    .line 65
    invoke-virtual {p0, v3, v2, v0}, Lmn6;->D(Ljava/lang/String;Ljava/lang/String;Lgn2;)Lsu/happ/proxyutility/domain/routing/entity/RouteProfile;

    .line 66
    .line 67
    .line 68
    return-object v1

    .line 69
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
