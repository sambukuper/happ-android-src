.class public final synthetic Lf69;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Ldn2;


# instance fields
.field public final synthetic X:B

.field public final synthetic Y:Lsu/happ/proxyutility/service/XRayProxyOnlyService;


# direct methods
.method public synthetic constructor <init>(Lsu/happ/proxyutility/service/XRayProxyOnlyService;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, Lf69;->X:B

    .line 2
    .line 3
    iput-object p1, p0, Lf69;->Y:Lsu/happ/proxyutility/service/XRayProxyOnlyService;

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
    iget-byte v0, p0, Lf69;->X:B

    .line 2
    .line 3
    iget-object p0, p0, Lf69;->Y:Lsu/happ/proxyutility/service/XRayProxyOnlyService;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    sget v0, Lsu/happ/proxyutility/service/XRayProxyOnlyService;->k0:I

    .line 9
    .line 10
    new-instance v0, Lri7;

    .line 11
    .line 12
    invoke-direct {v0, p0}, Lri7;-><init>(Lh69;)V

    .line 13
    .line 14
    .line 15
    return-object v0

    .line 16
    :pswitch_0
    sget v0, Lsu/happ/proxyutility/service/XRayProxyOnlyService;->k0:I

    .line 17
    .line 18
    new-instance v0, Lj61;

    .line 19
    .line 20
    const/4 v1, 0x2

    .line 21
    invoke-direct {v0, p0, v1}, Lj61;-><init>(Ljava/lang/Object;B)V

    .line 22
    .line 23
    .line 24
    return-object v0

    .line 25
    :pswitch_1
    sget v0, Lsu/happ/proxyutility/service/XRayProxyOnlyService;->k0:I

    .line 26
    .line 27
    new-instance v0, Ljz8;

    .line 28
    .line 29
    invoke-direct {v0, p0}, Ljz8;-><init>(Landroid/content/Context;)V

    .line 30
    .line 31
    .line 32
    return-object v0

    .line 33
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
