.class public final La95;
.super Loy1;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"


# instance fields
.field public final I0:Lbq4;

.field public final J0:F


# direct methods
.method public constructor <init>(Lbq4;F)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-direct {p0, v0}, Loy1;-><init>(B)V

    .line 3
    .line 4
    .line 5
    iput-object p1, p0, La95;->I0:Lbq4;

    .line 6
    .line 7
    iput p2, p0, La95;->J0:F

    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public final w()Z
    .locals 0

    .line 1
    const/4 p0, 0x1

    .line 2
    return p0
.end method

.method public final x(FFFLl77;)V
    .locals 1

    .line 1
    iget v0, p0, La95;->J0:F

    .line 2
    .line 3
    sub-float/2addr p2, v0

    .line 4
    iget-object p0, p0, La95;->I0:Lbq4;

    .line 5
    .line 6
    invoke-virtual {p0, p1, p2, p3, p4}, Lbq4;->x(FFFLl77;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method
