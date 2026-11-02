.class public final synthetic Lfr2;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Ldn2;


# instance fields
.field public final synthetic X:B

.field public final synthetic Y:Lgn2;

.field public final synthetic Z:Lsu/happ/proxyutility/domain/routing/entity/GeoFileKey;


# direct methods
.method public synthetic constructor <init>(Lgn2;Lsu/happ/proxyutility/domain/routing/entity/GeoFileKey;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, Lfr2;->X:B

    .line 2
    .line 3
    iput-object p1, p0, Lfr2;->Y:Lgn2;

    .line 4
    .line 5
    iput-object p2, p0, Lfr2;->Z:Lsu/happ/proxyutility/domain/routing/entity/GeoFileKey;

    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 3

    .line 1
    iget-byte v0, p0, Lfr2;->X:B

    .line 2
    .line 3
    sget-object v1, Ldn8;->a:Ldn8;

    .line 4
    .line 5
    iget-object v2, p0, Lfr2;->Z:Lsu/happ/proxyutility/domain/routing/entity/GeoFileKey;

    .line 6
    .line 7
    iget-object p0, p0, Lfr2;->Y:Lgn2;

    .line 8
    .line 9
    packed-switch v0, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    new-instance v0, Lxq2;

    .line 13
    .line 14
    invoke-direct {v0, v2}, Lxq2;-><init>(Lsu/happ/proxyutility/domain/routing/entity/GeoFileKey;)V

    .line 15
    .line 16
    .line 17
    invoke-interface {p0, v0}, Lgn2;->B(Ljava/lang/Object;)Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    return-object v1

    .line 21
    :pswitch_0
    invoke-virtual {v2}, Lsu/happ/proxyutility/domain/routing/entity/GeoFileKey;->d()Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 26
    .line 27
    .line 28
    new-instance v2, Lwq2;

    .line 29
    .line 30
    invoke-direct {v2, v0}, Lwq2;-><init>(Ljava/lang/String;)V

    .line 31
    .line 32
    .line 33
    invoke-interface {p0, v2}, Lgn2;->B(Ljava/lang/Object;)Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    return-object v1

    .line 37
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
