.class public final Lid2;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"


# instance fields
.field public final a:I

.field public final b:I

.field public final c:I


# direct methods
.method public constructor <init>(III)V
    .locals 0

    .line 12
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lid2;->a:I

    iput p2, p0, Lid2;->b:I

    iput p3, p0, Lid2;->c:I

    return-void
.end method

.method public constructor <init>(Lld2;I)V
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget v0, p1, Lld2;->b:I

    .line 5
    .line 6
    iget p1, p1, Lld2;->c:I

    .line 7
    .line 8
    invoke-direct {p0, v0, p1, p2}, Lid2;-><init>(III)V

    .line 9
    .line 10
    .line 11
    return-void
.end method
