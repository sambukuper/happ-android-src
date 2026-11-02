.class public final Lb01;
.super Lh70;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"


# instance fields
.field public final f0:Z


# direct methods
.method public constructor <init>(Lb8;Z)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lh70;-><init>(Lb8;)V

    .line 2
    .line 3
    .line 4
    iput-boolean p2, p0, Lb01;->f0:Z

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final l(Ljava/lang/String;)V
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-boolean v0, p0, Lb01;->f0:Z

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    invoke-super {p0, p1}, Lh70;->l(Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    return-void

    .line 12
    :cond_0
    iget-object p0, p0, Lh70;->Z:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast p0, Lb8;

    .line 15
    .line 16
    invoke-virtual {p0, p1}, Lb8;->s(Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    return-void
.end method
