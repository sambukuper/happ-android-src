.class public final Lgb2;
.super Ls51;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"


# instance fields
.field public f0:Landroid/content/Context;

.field public g0:Ldn7;

.field public h0:Ljava/util/Iterator;

.field public i0:Z

.field public synthetic j0:Ljava/lang/Object;

.field public final synthetic k0:Lib2;

.field public l0:I


# direct methods
.method public constructor <init>(Lib2;Ls51;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lgb2;->k0:Lib2;

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
    iput-object p1, p0, Lgb2;->j0:Ljava/lang/Object;

    .line 2
    .line 3
    iget p1, p0, Lgb2;->l0:I

    .line 4
    .line 5
    const/high16 v0, -0x80000000

    .line 6
    .line 7
    or-int/2addr p1, v0

    .line 8
    iput p1, p0, Lgb2;->l0:I

    .line 9
    .line 10
    iget-object p1, p0, Lgb2;->k0:Lib2;

    .line 11
    .line 12
    const/4 v0, 0x0

    .line 13
    invoke-virtual {p1, v0, v0, p0}, Lib2;->n(Landroid/content/Context;Lhd6;Ls51;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    return-object p0
.end method
