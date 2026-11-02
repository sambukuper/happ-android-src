.class public final synthetic Lrn6;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Ldn2;


# instance fields
.field public final synthetic X:B

.field public final synthetic Y:Lgn2;

.field public final synthetic Z:Lvo6;


# direct methods
.method public synthetic constructor <init>(Lgn2;Lvo6;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, Lrn6;->X:B

    .line 2
    .line 3
    iput-object p1, p0, Lrn6;->Y:Lgn2;

    .line 4
    .line 5
    iput-object p2, p0, Lrn6;->Z:Lvo6;

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
    .locals 4

    .line 1
    iget-byte v0, p0, Lrn6;->X:B

    .line 2
    .line 3
    sget-object v1, Ldn8;->a:Ldn8;

    .line 4
    .line 5
    iget-object v2, p0, Lrn6;->Z:Lvo6;

    .line 6
    .line 7
    iget-object p0, p0, Lrn6;->Y:Lgn2;

    .line 8
    .line 9
    packed-switch v0, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    new-instance v0, Lso6;

    .line 13
    .line 14
    iget-object v3, v2, Lvo6;->a:Lsu/happ/proxyutility/domain/routing/entity/RouteProfile;

    .line 15
    .line 16
    invoke-virtual {v3}, Lsu/happ/proxyutility/domain/routing/entity/RouteProfile;->d()Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object v3

    .line 20
    iget-object v2, v2, Lvo6;->c:Ljava/lang/String;

    .line 21
    .line 22
    invoke-direct {v0, v3, v2}, Lso6;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    invoke-interface {p0, v0}, Lgn2;->B(Ljava/lang/Object;)Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    return-object v1

    .line 29
    :pswitch_0
    new-instance v0, Lko6;

    .line 30
    .line 31
    iget-object v3, v2, Lvo6;->a:Lsu/happ/proxyutility/domain/routing/entity/RouteProfile;

    .line 32
    .line 33
    invoke-virtual {v3}, Lsu/happ/proxyutility/domain/routing/entity/RouteProfile;->d()Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object v3

    .line 37
    iget-object v2, v2, Lvo6;->c:Ljava/lang/String;

    .line 38
    .line 39
    invoke-direct {v0, v3, v2}, Lko6;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 40
    .line 41
    .line 42
    invoke-interface {p0, v0}, Lgn2;->B(Ljava/lang/Object;)Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    return-object v1

    .line 46
    :pswitch_1
    iget-object v0, v2, Lvo6;->c:Ljava/lang/String;

    .line 47
    .line 48
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 49
    .line 50
    .line 51
    new-instance v2, Llo6;

    .line 52
    .line 53
    invoke-direct {v2, v0}, Llo6;-><init>(Ljava/lang/String;)V

    .line 54
    .line 55
    .line 56
    invoke-interface {p0, v2}, Lgn2;->B(Ljava/lang/Object;)Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    return-object v1

    .line 60
    nop

    .line 61
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
