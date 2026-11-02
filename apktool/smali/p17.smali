.class public final Lp17;
.super Ls51;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"


# instance fields
.field public f0:Ljava/lang/String;

.field public g0:Ljava/util/List;

.field public h0:S

.field public i0:I

.field public synthetic j0:Ljava/lang/Object;

.field public final synthetic k0:Lq17;

.field public l0:I


# direct methods
.method public constructor <init>(Lq17;Ls51;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lp17;->k0:Lq17;

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
    .locals 2

    .line 1
    iput-object p1, p0, Lp17;->j0:Ljava/lang/Object;

    .line 2
    .line 3
    iget p1, p0, Lp17;->l0:I

    .line 4
    .line 5
    const/high16 v0, -0x80000000

    .line 6
    .line 7
    or-int/2addr p1, v0

    .line 8
    iput p1, p0, Lp17;->l0:I

    .line 9
    .line 10
    const/4 p1, 0x0

    .line 11
    const/4 v0, 0x0

    .line 12
    iget-object v1, p0, Lp17;->k0:Lq17;

    .line 13
    .line 14
    invoke-virtual {v1, p1, v0, p0}, Lq17;->a(Ljava/lang/String;ILs51;)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    return-object p0
.end method
