.class public final Leu6;
.super Ljb5;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"


# instance fields
.field public l0:F

.field public final synthetic m0:Lfu6;


# direct methods
.method public constructor <init>(Lfu6;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Leu6;->m0:Lfu6;

    .line 5
    .line 6
    const/4 p1, 0x0

    .line 7
    iput p1, p0, Leu6;->l0:F

    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public final K(Ljava/lang/String;)V
    .locals 2

    .line 1
    iget v0, p0, Leu6;->l0:F

    .line 2
    .line 3
    iget-object v1, p0, Leu6;->m0:Lfu6;

    .line 4
    .line 5
    iget-object v1, v1, Lfu6;->f0:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v1, Ldu6;

    .line 8
    .line 9
    iget-object v1, v1, Ldu6;->d:Landroid/graphics/Paint;

    .line 10
    .line 11
    invoke-virtual {v1, p1}, Landroid/graphics/Paint;->measureText(Ljava/lang/String;)F

    .line 12
    .line 13
    .line 14
    move-result p1

    .line 15
    add-float/2addr p1, v0

    .line 16
    iput p1, p0, Leu6;->l0:F

    .line 17
    .line 18
    return-void
.end method
