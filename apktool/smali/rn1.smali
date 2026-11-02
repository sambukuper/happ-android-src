.class public final Lrn1;
.super Lvj8;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"


# instance fields
.field public final synthetic B0:Lmk2;

.field public final synthetic C0:Lsn1;


# direct methods
.method public constructor <init>(Lsn1;Lmk2;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lrn1;->C0:Lsn1;

    .line 5
    .line 6
    iput-object p2, p0, Lrn1;->B0:Lmk2;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final W(I)Landroid/view/View;
    .locals 2

    .line 1
    iget-object v0, p0, Lrn1;->B0:Lmk2;

    .line 2
    .line 3
    invoke-virtual {v0}, Lmk2;->X()Z

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    invoke-virtual {v0, p1}, Lmk2;->W(I)Landroid/view/View;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    return-object p0

    .line 14
    :cond_0
    iget-object p0, p0, Lrn1;->C0:Lsn1;

    .line 15
    .line 16
    iget-object p0, p0, Lsn1;->o1:Landroid/app/Dialog;

    .line 17
    .line 18
    if-eqz p0, :cond_1

    .line 19
    .line 20
    invoke-virtual {p0, p1}, Landroid/app/Dialog;->findViewById(I)Landroid/view/View;

    .line 21
    .line 22
    .line 23
    move-result-object p0

    .line 24
    return-object p0

    .line 25
    :cond_1
    const/4 p0, 0x0

    .line 26
    return-object p0
.end method

.method public final X()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lrn1;->B0:Lmk2;

    .line 2
    .line 3
    invoke-virtual {v0}, Lmk2;->X()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_1

    .line 8
    .line 9
    iget-object p0, p0, Lrn1;->C0:Lsn1;

    .line 10
    .line 11
    iget-boolean p0, p0, Lsn1;->s1:Z

    .line 12
    .line 13
    if-eqz p0, :cond_0

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    const/4 p0, 0x0

    .line 17
    return p0

    .line 18
    :cond_1
    :goto_0
    const/4 p0, 0x1

    .line 19
    return p0
.end method
