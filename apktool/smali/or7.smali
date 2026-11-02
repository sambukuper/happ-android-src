.class public final Lor7;
.super Ls51;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"


# instance fields
.field public f0:Ljava/lang/String;

.field public g0:Ljava/lang/String;

.field public h0:Ldn2;

.field public i0:Lgn2;

.field public j0:Lgn2;

.field public k0:Lsn2;

.field public l0:Ljava/lang/Boolean;

.field public m0:Lo15;

.field public n0:Z

.field public synthetic o0:Ljava/lang/Object;

.field public final synthetic p0:Lpr7;

.field public q0:I


# direct methods
.method public constructor <init>(Lpr7;Ls51;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lor7;->p0:Lpr7;

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
    .locals 11

    .line 1
    iput-object p1, p0, Lor7;->o0:Ljava/lang/Object;

    .line 2
    .line 3
    iget p1, p0, Lor7;->q0:I

    .line 4
    .line 5
    const/high16 v0, -0x80000000

    .line 6
    .line 7
    or-int/2addr p1, v0

    .line 8
    iput p1, p0, Lor7;->q0:I

    .line 9
    .line 10
    const/4 v8, 0x0

    .line 11
    const/4 v9, 0x0

    .line 12
    iget-object v0, p0, Lor7;->p0:Lpr7;

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
    move-object v10, p0

    .line 22
    invoke-virtual/range {v0 .. v10}, Lpr7;->a(Ljava/lang/String;ZLjava/lang/String;Ldn2;Lgn2;Lgn2;Lsn2;Lnr7;Ljava/lang/Boolean;Ls51;)Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    return-object p0
.end method
