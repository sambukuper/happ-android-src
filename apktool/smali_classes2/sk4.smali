.class public final Lsk4;
.super Ls51;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"


# instance fields
.field public f0:Ljava/lang/String;

.field public g0:Lsu/happ/proxyutility/dto/SubscriptionItem;

.field public h0:Ljava/lang/String;

.field public i0:Ljava/lang/Boolean;

.field public j0:Ljava/lang/Boolean;

.field public k0:Lsu/happ/proxyutility/dto/SubscriptionItem;

.field public l0:Ljava/util/Iterator;

.field public m0:Z

.field public n0:Z

.field public o0:Z

.field public p0:Z

.field public synthetic q0:Ljava/lang/Object;

.field public final synthetic r0:Lsu/happ/proxyutility/feature/main/MainActivity;

.field public s0:I


# direct methods
.method public constructor <init>(Lsu/happ/proxyutility/feature/main/MainActivity;Ls51;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lsk4;->r0:Lsu/happ/proxyutility/feature/main/MainActivity;

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
    .locals 13

    .line 1
    iput-object p1, p0, Lsk4;->q0:Ljava/lang/Object;

    .line 2
    .line 3
    iget p1, p0, Lsk4;->s0:I

    .line 4
    .line 5
    const/high16 v0, -0x80000000

    .line 6
    .line 7
    or-int/2addr p1, v0

    .line 8
    iput p1, p0, Lsk4;->s0:I

    .line 9
    .line 10
    sget p1, Lsu/happ/proxyutility/feature/main/MainActivity;->y1:I

    .line 11
    .line 12
    iget-object v0, p0, Lsk4;->r0:Lsu/happ/proxyutility/feature/main/MainActivity;

    .line 13
    .line 14
    const/4 v1, 0x0

    .line 15
    const/4 v2, 0x0

    .line 16
    const/4 v3, 0x0

    .line 17
    const/4 v4, 0x0

    .line 18
    const/4 v5, 0x0

    .line 19
    const/4 v6, 0x0

    .line 20
    const/4 v7, 0x0

    .line 21
    const/4 v8, 0x0

    .line 22
    const/4 v9, 0x0

    .line 23
    const/4 v10, 0x0

    .line 24
    const/4 v11, 0x0

    .line 25
    move-object v12, p0

    .line 26
    invoke-virtual/range {v0 .. v12}, Lsu/happ/proxyutility/feature/main/MainActivity;->S(Lsu/happ/proxyutility/dto/ImportResult;Ljava/lang/String;Lsu/happ/proxyutility/dto/SubscriptionItem;ZZLjava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;ZZLjava/util/List;Ls51;)Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object p0

    .line 30
    return-object p0
.end method
