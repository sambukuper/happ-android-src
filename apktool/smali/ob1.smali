.class public abstract Lob1;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"


# static fields
.field public static final a:Lpb1;


# direct methods
.method static constructor <clinit>()V
    .locals 8

    .line 1
    new-instance v0, Lpb1;

    .line 2
    .line 3
    invoke-static {}, Lr22;->values()[Lr22;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    array-length v2, v1

    .line 8
    const/4 v3, 0x0

    .line 9
    move v4, v3

    .line 10
    :goto_0
    if-ge v4, v2, :cond_0

    .line 11
    .line 12
    aget-object v5, v1, v4

    .line 13
    .line 14
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 15
    .line 16
    .line 17
    add-int/lit8 v4, v4, 0x1

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    invoke-static {}, Lvp3;->values()[Lvp3;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    array-length v2, v1

    .line 25
    move v4, v3

    .line 26
    move v5, v4

    .line 27
    :goto_1
    if-ge v4, v2, :cond_2

    .line 28
    .line 29
    aget-object v6, v1, v4

    .line 30
    .line 31
    iget-boolean v7, v6, Lvp3;->X:Z

    .line 32
    .line 33
    if-eqz v7, :cond_1

    .line 34
    .line 35
    iget v6, v6, Lvp3;->Y:I

    .line 36
    .line 37
    or-int/2addr v5, v6

    .line 38
    :cond_1
    add-int/lit8 v4, v4, 0x1

    .line 39
    .line 40
    goto :goto_1

    .line 41
    :cond_2
    invoke-direct {v0, v3, v5}, Lpb1;-><init>(II)V

    .line 42
    .line 43
    .line 44
    sput-object v0, Lob1;->a:Lpb1;

    .line 45
    .line 46
    return-void
.end method
