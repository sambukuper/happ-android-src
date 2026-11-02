.class public final Lbv7;
.super Ls51;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"


# instance fields
.field public f0:Z

.field public g0:Ljava/lang/String;

.field public h0:Lqs7;

.field public i0:Ljava/lang/Integer;

.field public j0:Ljava/util/Iterator;

.field public k0:I

.field public synthetic l0:Ljava/lang/Object;

.field public final synthetic m0:Lsu/happ/proxyutility/service/SubscriptionUpdater$UpdateTask;

.field public n0:I


# direct methods
.method public constructor <init>(Lsu/happ/proxyutility/service/SubscriptionUpdater$UpdateTask;Ls51;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lbv7;->m0:Lsu/happ/proxyutility/service/SubscriptionUpdater$UpdateTask;

    .line 2
    .line 3
    invoke-direct {p0, p2}, Ls51;-><init>(Lq51;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final q(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iput-object p1, p0, Lbv7;->l0:Ljava/lang/Object;

    .line 2
    .line 3
    iget p1, p0, Lbv7;->n0:I

    .line 4
    .line 5
    const/high16 v0, -0x80000000

    .line 6
    .line 7
    or-int/2addr p1, v0

    .line 8
    iput p1, p0, Lbv7;->n0:I

    .line 9
    .line 10
    iget-object p1, p0, Lbv7;->m0:Lsu/happ/proxyutility/service/SubscriptionUpdater$UpdateTask;

    .line 11
    .line 12
    invoke-virtual {p1, p0}, Lsu/happ/proxyutility/service/SubscriptionUpdater$UpdateTask;->e(Lq51;)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    return-object p0
.end method
