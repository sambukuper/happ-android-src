.class public final Lex2;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Lw80;


# instance fields
.field public final synthetic b:F


# direct methods
.method public constructor <init>(F)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput p1, p0, Lex2;->b:F

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final a(FFF)F
    .locals 1

    .line 1
    const/high16 v0, 0x40000000    # 2.0f

    .line 2
    .line 3
    div-float/2addr p2, v0

    .line 4
    add-float/2addr p2, p1

    .line 5
    iget p0, p0, Lex2;->b:F

    .line 6
    .line 7
    mul-float/2addr p3, p0

    .line 8
    sub-float/2addr p2, p3

    .line 9
    return p2
.end method
