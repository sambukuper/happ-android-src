.class public final Lvr7;
.super Ls51;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"


# instance fields
.field public f0:Ljava/lang/String;

.field public g0:Ldn2;

.field public h0:Lgn2;

.field public i0:Lgn2;

.field public j0:Lsn2;

.field public k0:Ljava/lang/Boolean;

.field public l0:Lsu/happ/proxyutility/dto/SubscriptionItem;

.field public m0:Z

.field public n0:Z

.field public o0:I

.field public synthetic p0:Ljava/lang/Object;

.field public final synthetic q0:Lxr7;

.field public r0:I


# direct methods
.method public constructor <init>(Lxr7;Ls51;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lvr7;->q0:Lxr7;

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
    .locals 10

    .line 1
    iput-object p1, p0, Lvr7;->p0:Ljava/lang/Object;

    .line 2
    .line 3
    iget p1, p0, Lvr7;->r0:I

    .line 4
    .line 5
    const/high16 v0, -0x80000000

    .line 6
    .line 7
    or-int/2addr p1, v0

    .line 8
    iput p1, p0, Lvr7;->r0:I

    .line 9
    .line 10
    const/4 v7, 0x0

    .line 11
    const/4 v8, 0x0

    .line 12
    iget-object v0, p0, Lvr7;->q0:Lxr7;

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
    move-object v9, p0

    .line 21
    invoke-virtual/range {v0 .. v9}, Lxr7;->d(Ljava/lang/String;ZLjava/lang/String;Ldn2;Lgn2;Lgn2;Lsn2;Ljava/lang/Boolean;Ls51;)Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    return-object p0
.end method
