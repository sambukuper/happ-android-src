.class public abstract Lhl6;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"


# static fields
.field public static final a:Lox1;

.field public static final b:Landroidx/compose/material3/c;

.field public static final c:Landroidx/compose/material3/c;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .line 1
    new-instance v0, Lw76;

    .line 2
    .line 3
    const/16 v1, 0x8

    .line 4
    .line 5
    invoke-direct {v0, v1}, Lw76;-><init>(B)V

    .line 6
    .line 7
    .line 8
    new-instance v1, Lox1;

    .line 9
    .line 10
    const/4 v2, 0x0

    .line 11
    invoke-direct {v1, v0, v2}, Lox1;-><init>(Ldn2;B)V

    .line 12
    .line 13
    .line 14
    sput-object v1, Lhl6;->a:Lox1;

    .line 15
    .line 16
    new-instance v0, Landroidx/compose/material3/c;

    .line 17
    .line 18
    sget-wide v1, Ldw0;->g:J

    .line 19
    .line 20
    const/4 v3, 0x1

    .line 21
    const/high16 v4, 0x7fc00000    # Float.NaN

    .line 22
    .line 23
    invoke-direct {v0, v3, v4, v1, v2}, Landroidx/compose/material3/c;-><init>(ZFJ)V

    .line 24
    .line 25
    .line 26
    sput-object v0, Lhl6;->b:Landroidx/compose/material3/c;

    .line 27
    .line 28
    new-instance v0, Landroidx/compose/material3/c;

    .line 29
    .line 30
    const/4 v3, 0x0

    .line 31
    invoke-direct {v0, v3, v4, v1, v2}, Landroidx/compose/material3/c;-><init>(ZFJ)V

    .line 32
    .line 33
    .line 34
    sput-object v0, Lhl6;->c:Landroidx/compose/material3/c;

    .line 35
    .line 36
    return-void
.end method

.method public static a(FIJZ)Landroidx/compose/material3/c;
    .locals 2

    .line 1
    and-int/lit8 v0, p1, 0x1

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    const/4 p4, 0x1

    .line 6
    :cond_0
    and-int/lit8 v0, p1, 0x2

    .line 7
    .line 8
    const/high16 v1, 0x7fc00000    # Float.NaN

    .line 9
    .line 10
    if-eqz v0, :cond_1

    .line 11
    .line 12
    move p0, v1

    .line 13
    :cond_1
    and-int/lit8 p1, p1, 0x4

    .line 14
    .line 15
    if-eqz p1, :cond_2

    .line 16
    .line 17
    sget-wide p2, Ldw0;->g:J

    .line 18
    .line 19
    :cond_2
    invoke-static {p0, v1}, Lkt1;->b(FF)Z

    .line 20
    .line 21
    .line 22
    move-result p1

    .line 23
    if-eqz p1, :cond_4

    .line 24
    .line 25
    sget-wide v0, Ldw0;->g:J

    .line 26
    .line 27
    invoke-static {p2, p3, v0, v1}, Ltk8;->a(JJ)Z

    .line 28
    .line 29
    .line 30
    move-result p1

    .line 31
    if-eqz p1, :cond_4

    .line 32
    .line 33
    if-eqz p4, :cond_3

    .line 34
    .line 35
    sget-object p0, Lhl6;->b:Landroidx/compose/material3/c;

    .line 36
    .line 37
    return-object p0

    .line 38
    :cond_3
    sget-object p0, Lhl6;->c:Landroidx/compose/material3/c;

    .line 39
    .line 40
    return-object p0

    .line 41
    :cond_4
    new-instance p1, Landroidx/compose/material3/c;

    .line 42
    .line 43
    invoke-direct {p1, p4, p0, p2, p3}, Landroidx/compose/material3/c;-><init>(ZFJ)V

    .line 44
    .line 45
    .line 46
    return-object p1
.end method
