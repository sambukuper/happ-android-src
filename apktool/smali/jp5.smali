.class public final Ljp5;
.super Ls51;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"


# instance fields
.field public f0:Ljava/lang/Object;

.field public g0:Ljava/lang/Object;

.field public h0:Lq15;

.field public i0:J

.field public synthetic j0:Ljava/lang/Object;

.field public final synthetic k0:Lop5;

.field public l0:I


# direct methods
.method public constructor <init>(Lop5;Ls51;)V
    .locals 0

    .line 1
    iput-object p1, p0, Ljp5;->k0:Lop5;

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
    .locals 6

    .line 1
    iput-object p1, p0, Ljp5;->j0:Ljava/lang/Object;

    .line 2
    .line 3
    iget p1, p0, Ljp5;->l0:I

    .line 4
    .line 5
    const/high16 v0, -0x80000000

    .line 6
    .line 7
    or-int/2addr p1, v0

    .line 8
    iput p1, p0, Ljp5;->l0:I

    .line 9
    .line 10
    const-wide/16 v2, 0x0

    .line 11
    .line 12
    const/4 v4, 0x0

    .line 13
    iget-object v0, p0, Ljp5;->k0:Lop5;

    .line 14
    .line 15
    const/4 v1, 0x0

    .line 16
    move-object v5, p0

    .line 17
    invoke-virtual/range {v0 .. v5}, Lop5;->b(Ljava/lang/CharSequence;JLandroid/view/textclassifier/TextClassifier;Ls51;)Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    return-object p0
.end method
