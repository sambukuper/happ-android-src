.class public abstract Lu3;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"


# direct methods
.method public static A(Lkd8;Landroid/view/inputmethod/PreviewableHandwritingGesture;Ly78;Landroid/os/CancellationSignal;)Z
    .locals 4

    .line 1
    instance-of v0, p1, Landroid/view/inputmethod/SelectGesture;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    const/4 v2, 0x0

    .line 5
    if-eqz v0, :cond_1

    .line 6
    .line 7
    check-cast p1, Landroid/view/inputmethod/SelectGesture;

    .line 8
    .line 9
    invoke-virtual {p1}, Landroid/view/inputmethod/SelectGesture;->getSelectionArea()Landroid/graphics/RectF;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    invoke-static {v0}, Lpu;->V(Landroid/graphics/RectF;)Ls86;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    invoke-virtual {p1}, Landroid/view/inputmethod/SelectGesture;->getGranularity()I

    .line 18
    .line 19
    .line 20
    move-result p1

    .line 21
    if-eq p1, v1, :cond_0

    .line 22
    .line 23
    move p1, v2

    .line 24
    goto :goto_0

    .line 25
    :cond_0
    move p1, v1

    .line 26
    :goto_0
    invoke-static {p2, v0, p1}, Lg33;->y(Ly78;Ls86;I)J

    .line 27
    .line 28
    .line 29
    move-result-wide p1

    .line 30
    invoke-static {p0, p1, p2, v2}, Lu3;->q(Lkd8;JI)V

    .line 31
    .line 32
    .line 33
    goto/16 :goto_4

    .line 34
    .line 35
    :cond_1
    instance-of v0, p1, Landroid/view/inputmethod/DeleteGesture;

    .line 36
    .line 37
    if-eqz v0, :cond_3

    .line 38
    .line 39
    check-cast p1, Landroid/view/inputmethod/DeleteGesture;

    .line 40
    .line 41
    invoke-virtual {p1}, Landroid/view/inputmethod/DeleteGesture;->getDeletionArea()Landroid/graphics/RectF;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    invoke-static {v0}, Lpu;->V(Landroid/graphics/RectF;)Ls86;

    .line 46
    .line 47
    .line 48
    move-result-object v0

    .line 49
    invoke-virtual {p1}, Landroid/view/inputmethod/DeleteGesture;->getGranularity()I

    .line 50
    .line 51
    .line 52
    move-result p1

    .line 53
    if-eq p1, v1, :cond_2

    .line 54
    .line 55
    goto :goto_1

    .line 56
    :cond_2
    move v2, v1

    .line 57
    :goto_1
    invoke-static {p2, v0, v2}, Lg33;->y(Ly78;Ls86;I)J

    .line 58
    .line 59
    .line 60
    move-result-wide p1

    .line 61
    invoke-static {p0, p1, p2, v1}, Lu3;->q(Lkd8;JI)V

    .line 62
    .line 63
    .line 64
    goto :goto_4

    .line 65
    :cond_3
    instance-of v0, p1, Landroid/view/inputmethod/SelectRangeGesture;

    .line 66
    .line 67
    if-eqz v0, :cond_5

    .line 68
    .line 69
    check-cast p1, Landroid/view/inputmethod/SelectRangeGesture;

    .line 70
    .line 71
    invoke-virtual {p1}, Landroid/view/inputmethod/SelectRangeGesture;->getSelectionStartArea()Landroid/graphics/RectF;

    .line 72
    .line 73
    .line 74
    move-result-object v0

    .line 75
    invoke-static {v0}, Lpu;->V(Landroid/graphics/RectF;)Ls86;

    .line 76
    .line 77
    .line 78
    move-result-object v0

    .line 79
    invoke-virtual {p1}, Landroid/view/inputmethod/SelectRangeGesture;->getSelectionEndArea()Landroid/graphics/RectF;

    .line 80
    .line 81
    .line 82
    move-result-object v3

    .line 83
    invoke-static {v3}, Lpu;->V(Landroid/graphics/RectF;)Ls86;

    .line 84
    .line 85
    .line 86
    move-result-object v3

    .line 87
    invoke-virtual {p1}, Landroid/view/inputmethod/SelectRangeGesture;->getGranularity()I

    .line 88
    .line 89
    .line 90
    move-result p1

    .line 91
    if-eq p1, v1, :cond_4

    .line 92
    .line 93
    move p1, v2

    .line 94
    goto :goto_2

    .line 95
    :cond_4
    move p1, v1

    .line 96
    :goto_2
    invoke-static {p2, v0, v3, p1}, Lg33;->z(Ly78;Ls86;Ls86;I)J

    .line 97
    .line 98
    .line 99
    move-result-wide p1

    .line 100
    invoke-static {p0, p1, p2, v2}, Lu3;->q(Lkd8;JI)V

    .line 101
    .line 102
    .line 103
    goto :goto_4

    .line 104
    :cond_5
    instance-of v0, p1, Landroid/view/inputmethod/DeleteRangeGesture;

    .line 105
    .line 106
    if-eqz v0, :cond_8

    .line 107
    .line 108
    check-cast p1, Landroid/view/inputmethod/DeleteRangeGesture;

    .line 109
    .line 110
    invoke-virtual {p1}, Landroid/view/inputmethod/DeleteRangeGesture;->getDeletionStartArea()Landroid/graphics/RectF;

    .line 111
    .line 112
    .line 113
    move-result-object v0

    .line 114
    invoke-static {v0}, Lpu;->V(Landroid/graphics/RectF;)Ls86;

    .line 115
    .line 116
    .line 117
    move-result-object v0

    .line 118
    invoke-virtual {p1}, Landroid/view/inputmethod/DeleteRangeGesture;->getDeletionEndArea()Landroid/graphics/RectF;

    .line 119
    .line 120
    .line 121
    move-result-object v3

    .line 122
    invoke-static {v3}, Lpu;->V(Landroid/graphics/RectF;)Ls86;

    .line 123
    .line 124
    .line 125
    move-result-object v3

    .line 126
    invoke-virtual {p1}, Landroid/view/inputmethod/DeleteRangeGesture;->getGranularity()I

    .line 127
    .line 128
    .line 129
    move-result p1

    .line 130
    if-eq p1, v1, :cond_6

    .line 131
    .line 132
    goto :goto_3

    .line 133
    :cond_6
    move v2, v1

    .line 134
    :goto_3
    invoke-static {p2, v0, v3, v2}, Lg33;->z(Ly78;Ls86;Ls86;I)J

    .line 135
    .line 136
    .line 137
    move-result-wide p1

    .line 138
    invoke-static {p0, p1, p2, v1}, Lu3;->q(Lkd8;JI)V

    .line 139
    .line 140
    .line 141
    :goto_4
    if-eqz p3, :cond_7

    .line 142
    .line 143
    new-instance p1, Lqz0;

    .line 144
    .line 145
    invoke-direct {p1, p0, v1}, Lqz0;-><init>(Ljava/lang/Object;B)V

    .line 146
    .line 147
    .line 148
    invoke-virtual {p3, p1}, Landroid/os/CancellationSignal;->setOnCancelListener(Landroid/os/CancellationSignal$OnCancelListener;)V

    .line 149
    .line 150
    .line 151
    :cond_7
    return v1

    .line 152
    :cond_8
    return v2
.end method

.method public static B(Landroid/app/PendingIntent;)V
    .locals 3

    .line 1
    :try_start_0
    invoke-static {}, Landroid/app/ActivityOptions;->makeBasic()Landroid/app/ActivityOptions;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 6
    .line 7
    const/16 v2, 0x24

    .line 8
    .line 9
    if-lt v1, v2, :cond_0

    .line 10
    .line 11
    const/4 v1, 0x4

    .line 12
    invoke-virtual {v0, v1}, Landroid/app/ActivityOptions;->setPendingIntentBackgroundActivityStartMode(I)Landroid/app/ActivityOptions;

    .line 13
    .line 14
    .line 15
    goto :goto_0

    .line 16
    :catch_0
    move-exception v0

    .line 17
    goto :goto_1

    .line 18
    :cond_0
    const/4 v1, 0x1

    .line 19
    invoke-virtual {v0, v1}, Landroid/app/ActivityOptions;->setPendingIntentBackgroundActivityStartMode(I)Landroid/app/ActivityOptions;

    .line 20
    .line 21
    .line 22
    :goto_0
    invoke-virtual {v0}, Landroid/app/ActivityOptions;->toBundle()Landroid/os/Bundle;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    invoke-virtual {p0, v0}, Landroid/app/PendingIntent;->send(Landroid/os/Bundle;)V
    :try_end_0
    .catch Landroid/app/PendingIntent$CanceledException; {:try_start_0 .. :try_end_0} :catch_0

    .line 27
    .line 28
    .line 29
    return-void

    .line 30
    :goto_1
    invoke-static {p0}, Ljava/util/Objects;->toString(Ljava/lang/Object;)Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    return-void
.end method

.method public static C(Landroid/view/accessibility/AccessibilityEvent;Z)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Landroid/view/accessibility/AccessibilityEvent;->setAccessibilityDataSensitive(Z)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static D(Landroid/view/accessibility/AccessibilityNodeInfo;Z)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Landroid/view/accessibility/AccessibilityNodeInfo;->setAccessibilityDataSensitive(Z)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static E(Landroid/view/inputmethod/EditorInfo;)V
    .locals 7

    .line 1
    const-class v0, Landroid/view/inputmethod/SelectGesture;

    .line 2
    .line 3
    const-class v1, Landroid/view/inputmethod/DeleteGesture;

    .line 4
    .line 5
    const-class v2, Landroid/view/inputmethod/SelectRangeGesture;

    .line 6
    .line 7
    const-class v3, Landroid/view/inputmethod/DeleteRangeGesture;

    .line 8
    .line 9
    const-class v4, Landroid/view/inputmethod/JoinOrSplitGesture;

    .line 10
    .line 11
    const-class v5, Landroid/view/inputmethod/InsertGesture;

    .line 12
    .line 13
    const-class v6, Landroid/view/inputmethod/RemoveSpaceGesture;

    .line 14
    .line 15
    filled-new-array/range {v0 .. v6}, [Ljava/lang/Class;

    .line 16
    .line 17
    .line 18
    move-result-object v4

    .line 19
    invoke-static {v4}, Li21;->L([Ljava/lang/Object;)Ljava/util/List;

    .line 20
    .line 21
    .line 22
    move-result-object v4

    .line 23
    invoke-virtual {p0, v4}, Landroid/view/inputmethod/EditorInfo;->setSupportedHandwritingGestures(Ljava/util/List;)V

    .line 24
    .line 25
    .line 26
    filled-new-array {v0, v1, v2, v3}, [Ljava/lang/Class;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    invoke-static {v0}, Leu;->L0([Ljava/lang/Object;)Ljava/util/Set;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    invoke-virtual {p0, v0}, Landroid/view/inputmethod/EditorInfo;->setSupportedHandwritingGesturePreviews(Ljava/util/Set;)V

    .line 35
    .line 36
    .line 37
    return-void
.end method

.method public static F(Landroid/widget/TextView;IF)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Landroid/widget/TextView;->setLineHeight(IF)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static final G(Landroid/hardware/camera2/params/ExtensionSessionConfiguration;Landroid/hardware/camera2/params/OutputConfiguration;)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Landroid/hardware/camera2/params/ExtensionSessionConfiguration;->setPostviewOutputConfiguration(Landroid/hardware/camera2/params/OutputConfiguration;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static final H(Ljava/util/LinkedHashMap;)V
    .locals 2

    .line 1
    sget-object v0, Landroid/hardware/camera2/CaptureRequest;->CONTROL_SETTINGS_OVERRIDE:Landroid/hardware/camera2/CaptureRequest$Key;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 5
    .line 6
    .line 7
    move-result-object v1

    .line 8
    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public static final a(Landroid/view/inputmethod/CursorAnchorInfo$Builder;Lx78;Ls86;)V
    .locals 6

    .line 1
    invoke-virtual {p2}, Ls86;->h()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_1

    .line 6
    .line 7
    iget-object v0, p1, Lx78;->b:Lbz4;

    .line 8
    .line 9
    iget v1, v0, Lbz4;->f:I

    .line 10
    .line 11
    add-int/lit8 v1, v1, -0x1

    .line 12
    .line 13
    const/4 v2, 0x0

    .line 14
    if-gez v1, :cond_0

    .line 15
    .line 16
    move v1, v2

    .line 17
    :cond_0
    iget v3, p2, Ls86;->b:F

    .line 18
    .line 19
    invoke-virtual {v0, v3}, Lbz4;->d(F)I

    .line 20
    .line 21
    .line 22
    move-result v3

    .line 23
    invoke-static {v3, v2, v1}, Lx97;->n(III)I

    .line 24
    .line 25
    .line 26
    move-result v3

    .line 27
    iget p2, p2, Ls86;->d:F

    .line 28
    .line 29
    invoke-virtual {v0, p2}, Lbz4;->d(F)I

    .line 30
    .line 31
    .line 32
    move-result p2

    .line 33
    invoke-static {p2, v2, v1}, Lx97;->n(III)I

    .line 34
    .line 35
    .line 36
    move-result p2

    .line 37
    if-gt v3, p2, :cond_1

    .line 38
    .line 39
    :goto_0
    invoke-virtual {p1, v3}, Lx78;->f(I)F

    .line 40
    .line 41
    .line 42
    move-result v1

    .line 43
    invoke-virtual {v0, v3}, Lbz4;->e(I)F

    .line 44
    .line 45
    .line 46
    move-result v2

    .line 47
    invoke-virtual {p1, v3}, Lx78;->g(I)F

    .line 48
    .line 49
    .line 50
    move-result v4

    .line 51
    invoke-virtual {v0, v3}, Lbz4;->a(I)F

    .line 52
    .line 53
    .line 54
    move-result v5

    .line 55
    invoke-virtual {p0, v1, v2, v4, v5}, Landroid/view/inputmethod/CursorAnchorInfo$Builder;->addVisibleLineBounds(FFFF)Landroid/view/inputmethod/CursorAnchorInfo$Builder;

    .line 56
    .line 57
    .line 58
    if-eq v3, p2, :cond_1

    .line 59
    .line 60
    add-int/lit8 v3, v3, 0x1

    .line 61
    .line 62
    goto :goto_0

    .line 63
    :cond_1
    return-void
.end method

.method public static b(Landroid/content/Context;I)Landroid/content/Context;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Landroid/content/Context;->createDeviceContext(I)Landroid/content/Context;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static c(FLandroid/util/DisplayMetrics;)F
    .locals 1

    .line 1
    const/4 v0, 0x2

    .line 2
    invoke-static {v0, p0, p1}, Landroid/util/TypedValue;->deriveDimension(IFLandroid/util/DisplayMetrics;)F

    .line 3
    .line 4
    .line 5
    move-result p0

    .line 6
    return p0
.end method

.method public static d(Lkd8;Landroid/view/inputmethod/HandwritingGesture;)I
    .locals 4

    .line 1
    iget-object v0, p0, Lkd8;->a:Ly68;

    .line 2
    .line 3
    iget-object v1, p0, Lkd8;->b:Lde3;

    .line 4
    .line 5
    iget-object v2, v0, Ly68;->b:Lg48;

    .line 6
    .line 7
    invoke-virtual {v2}, Lg48;->a()Lmj0;

    .line 8
    .line 9
    .line 10
    move-result-object v2

    .line 11
    invoke-virtual {v2}, Lmj0;->A()V

    .line 12
    .line 13
    .line 14
    iget-object v2, v0, Ly68;->b:Lg48;

    .line 15
    .line 16
    const/4 v3, 0x0

    .line 17
    iput-object v3, v2, Lg48;->l0:Lqg5;

    .line 18
    .line 19
    invoke-virtual {p0, v2}, Lkd8;->l(Lg48;)V

    .line 20
    .line 21
    .line 22
    const/4 v2, 0x1

    .line 23
    sget-object v3, Le58;->X:Le58;

    .line 24
    .line 25
    invoke-virtual {v0, v1, v2, v3}, Ly68;->b(Lde3;ZLe58;)V

    .line 26
    .line 27
    .line 28
    invoke-virtual {v0, v2}, Ly68;->f(Z)V

    .line 29
    .line 30
    .line 31
    iget-object v1, v0, Ly68;->b:Lg48;

    .line 32
    .line 33
    iget-boolean v1, v1, Lg48;->g0:Z

    .line 34
    .line 35
    invoke-virtual {v0, v1}, Ly68;->e(Z)V

    .line 36
    .line 37
    .line 38
    invoke-virtual {p1}, Landroid/view/inputmethod/HandwritingGesture;->getFallbackText()Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object p1

    .line 42
    if-nez p1, :cond_0

    .line 43
    .line 44
    const/4 p0, 0x3

    .line 45
    return p0

    .line 46
    :cond_0
    const/16 v0, 0x1c

    .line 47
    .line 48
    const/4 v1, 0x0

    .line 49
    invoke-static {p0, p1, v1, v1, v0}, Lkd8;->h(Lkd8;Ljava/lang/CharSequence;ZZI)V

    .line 50
    .line 51
    .line 52
    const/4 p0, 0x5

    .line 53
    return p0
.end method

.method public static e(Landroid/app/job/JobScheduler;)Landroid/app/job/JobScheduler;
    .locals 1

    .line 1
    const-string v0, "androidx.work.systemjobscheduler"

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Landroid/app/job/JobScheduler;->forNamespace(Ljava/lang/String;)Landroid/app/job/JobScheduler;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    return-object p0
.end method

.method public static f()Landroid/view/accessibility/AccessibilityNodeInfo$AccessibilityAction;
    .locals 1

    .line 1
    sget-object v0, Landroid/view/accessibility/AccessibilityNodeInfo$AccessibilityAction;->ACTION_SCROLL_IN_DIRECTION:Landroid/view/accessibility/AccessibilityNodeInfo$AccessibilityAction;

    .line 2
    .line 3
    return-object v0
.end method

.method public static g(Landroid/view/VelocityTracker;I)F
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Landroid/view/VelocityTracker;->getAxisVelocity(I)F

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method

.method public static h(Landroid/view/accessibility/AccessibilityNodeInfo;Landroid/graphics/Rect;)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Landroid/view/accessibility/AccessibilityNodeInfo;->getBoundsInWindow(Landroid/graphics/Rect;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static i(Landroid/view/accessibility/AccessibilityNodeInfo;)Ljava/lang/CharSequence;
    .locals 0

    .line 1
    invoke-virtual {p0}, Landroid/view/accessibility/AccessibilityNodeInfo;->getContainerTitle()Ljava/lang/CharSequence;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static j(Landroid/content/Context;)I
    .locals 0

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Landroid/content/Context;->getDeviceId()I

    .line 5
    .line 6
    .line 7
    move-result p0

    .line 8
    return p0
.end method

.method public static k(Landroid/content/Context;)I
    .locals 0

    .line 1
    invoke-virtual {p0}, Landroid/content/Context;->getDeviceId()I

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method

.method public static l(Lv78;Landroid/graphics/RectF;ILb1;)[I
    .locals 3

    .line 1
    const/4 v0, 0x1

    .line 2
    if-ne p2, v0, :cond_0

    .line 3
    .line 4
    new-instance p2, Lxd6;

    .line 5
    .line 6
    iget-object v0, p0, Lv78;->f:Landroid/text/Layout;

    .line 7
    .line 8
    invoke-virtual {v0}, Landroid/text/Layout;->getText()Ljava/lang/CharSequence;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    invoke-virtual {p0}, Lv78;->k()Lnv0;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    const/16 v2, 0x1b

    .line 17
    .line 18
    invoke-direct {p2, v0, v1, v2}, Lxd6;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 19
    .line 20
    .line 21
    new-instance v0, Lln;

    .line 22
    .line 23
    invoke-direct {v0, p2}, Lln;-><init>(Lxd6;)V

    .line 24
    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_0
    new-instance p2, Landroid/text/GraphemeClusterSegmentFinder;

    .line 28
    .line 29
    iget-object p2, p0, Lv78;->f:Landroid/text/Layout;

    .line 30
    .line 31
    invoke-virtual {p2}, Landroid/text/Layout;->getText()Ljava/lang/CharSequence;

    .line 32
    .line 33
    .line 34
    move-result-object p2

    .line 35
    iget-object v0, p0, Lv78;->a:Landroid/text/TextPaint;

    .line 36
    .line 37
    new-instance v1, Landroid/text/GraphemeClusterSegmentFinder;

    .line 38
    .line 39
    invoke-direct {v1, p2, v0}, Landroid/text/GraphemeClusterSegmentFinder;-><init>(Ljava/lang/CharSequence;Landroid/text/TextPaint;)V

    .line 40
    .line 41
    .line 42
    move-object v0, v1

    .line 43
    :goto_0
    iget-object p0, p0, Lv78;->f:Landroid/text/Layout;

    .line 44
    .line 45
    new-instance p2, Lqe;

    .line 46
    .line 47
    invoke-direct {p2, p3}, Lqe;-><init>(Lb1;)V

    .line 48
    .line 49
    .line 50
    invoke-virtual {p0, p1, v0, p2}, Landroid/text/Layout;->getRangeForRect(Landroid/graphics/RectF;Landroid/text/SegmentFinder;Landroid/text/Layout$TextInclusionStrategy;)[I

    .line 51
    .line 52
    .line 53
    move-result-object p0

    .line 54
    return-object p0
.end method

.method public static m(Landroid/view/ViewConfiguration;)F
    .locals 0

    .line 1
    invoke-virtual {p0}, Landroid/view/ViewConfiguration;->getScaledHandwritingGestureLineMargin()I

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    int-to-float p0, p0

    .line 6
    return p0
.end method

.method public static n(Landroid/view/ViewConfiguration;)F
    .locals 0

    .line 1
    invoke-virtual {p0}, Landroid/view/ViewConfiguration;->getScaledHandwritingSlop()I

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    int-to-float p0, p0

    .line 6
    return p0
.end method

.method public static o(Landroid/view/ViewConfiguration;III)I
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2, p3}, Landroid/view/ViewConfiguration;->getScaledMaximumFlingVelocity(III)I

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method

.method public static p(Landroid/view/ViewConfiguration;III)I
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2, p3}, Landroid/view/ViewConfiguration;->getScaledMinimumFlingVelocity(III)I

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method

.method public static q(Lkd8;JI)V
    .locals 8

    .line 1
    invoke-static {p1, p2}, Lf88;->b(J)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    sget-object v1, Le58;->X:Le58;

    .line 6
    .line 7
    const/4 v2, 0x1

    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    iget-object p1, p0, Lkd8;->a:Ly68;

    .line 11
    .line 12
    iget-object p2, p0, Lkd8;->b:Lde3;

    .line 13
    .line 14
    iget-object p3, p1, Ly68;->b:Lg48;

    .line 15
    .line 16
    invoke-virtual {p3}, Lg48;->a()Lmj0;

    .line 17
    .line 18
    .line 19
    move-result-object p3

    .line 20
    invoke-virtual {p3}, Lmj0;->A()V

    .line 21
    .line 22
    .line 23
    iget-object p3, p1, Ly68;->b:Lg48;

    .line 24
    .line 25
    const/4 v0, 0x0

    .line 26
    iput-object v0, p3, Lg48;->l0:Lqg5;

    .line 27
    .line 28
    invoke-virtual {p0, p3}, Lkd8;->l(Lg48;)V

    .line 29
    .line 30
    .line 31
    invoke-virtual {p1, p2, v2, v1}, Ly68;->b(Lde3;ZLe58;)V

    .line 32
    .line 33
    .line 34
    invoke-virtual {p1, v2}, Ly68;->f(Z)V

    .line 35
    .line 36
    .line 37
    iget-object p0, p1, Ly68;->b:Lg48;

    .line 38
    .line 39
    iget-boolean p0, p0, Lg48;->g0:Z

    .line 40
    .line 41
    invoke-virtual {p1, p0}, Ly68;->e(Z)V

    .line 42
    .line 43
    .line 44
    return-void

    .line 45
    :cond_0
    invoke-virtual {p0, p1, p2}, Lkd8;->e(J)J

    .line 46
    .line 47
    .line 48
    move-result-wide p1

    .line 49
    iget-object v0, p0, Lkd8;->a:Ly68;

    .line 50
    .line 51
    iget-object p0, p0, Lkd8;->b:Lde3;

    .line 52
    .line 53
    iget-object v3, v0, Ly68;->b:Lg48;

    .line 54
    .line 55
    invoke-virtual {v3}, Lg48;->a()Lmj0;

    .line 56
    .line 57
    .line 58
    move-result-object v3

    .line 59
    invoke-virtual {v3}, Lmj0;->A()V

    .line 60
    .line 61
    .line 62
    iget-object v3, v0, Ly68;->b:Lg48;

    .line 63
    .line 64
    const/16 v4, 0x20

    .line 65
    .line 66
    shr-long v4, p1, v4

    .line 67
    .line 68
    long-to-int v4, v4

    .line 69
    const-wide v5, 0xffffffffL

    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    and-long/2addr p1, v5

    .line 75
    long-to-int p1, p1

    .line 76
    iget-object p2, v3, Lg48;->Z:Lmi5;

    .line 77
    .line 78
    if-ge v4, p1, :cond_1

    .line 79
    .line 80
    invoke-virtual {p2}, Lmi5;->length()I

    .line 81
    .line 82
    .line 83
    move-result v5

    .line 84
    const/4 v6, 0x0

    .line 85
    invoke-static {v4, v6, v5}, Lx97;->n(III)I

    .line 86
    .line 87
    .line 88
    move-result v4

    .line 89
    invoke-virtual {p2}, Lmi5;->length()I

    .line 90
    .line 91
    .line 92
    move-result p2

    .line 93
    invoke-static {p1, v6, p2}, Lx97;->n(III)I

    .line 94
    .line 95
    .line 96
    move-result p1

    .line 97
    new-instance p2, Lqg5;

    .line 98
    .line 99
    new-instance v5, Lh78;

    .line 100
    .line 101
    invoke-direct {v5, p3}, Lh78;-><init>(I)V

    .line 102
    .line 103
    .line 104
    invoke-static {v4, p1}, Lct7;->c(II)J

    .line 105
    .line 106
    .line 107
    move-result-wide v6

    .line 108
    new-instance p1, Lf88;

    .line 109
    .line 110
    invoke-direct {p1, v6, v7}, Lf88;-><init>(J)V

    .line 111
    .line 112
    .line 113
    invoke-direct {p2, v5, p1}, Lqg5;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 114
    .line 115
    .line 116
    iput-object p2, v3, Lg48;->l0:Lqg5;

    .line 117
    .line 118
    invoke-virtual {v0, p0, v2, v1}, Ly68;->b(Lde3;ZLe58;)V

    .line 119
    .line 120
    .line 121
    invoke-virtual {v0, v2}, Ly68;->f(Z)V

    .line 122
    .line 123
    .line 124
    iget-object p0, v0, Ly68;->b:Lg48;

    .line 125
    .line 126
    iget-boolean p0, p0, Lg48;->g0:Z

    .line 127
    .line 128
    invoke-virtual {v0, p0}, Ly68;->e(Z)V

    .line 129
    .line 130
    .line 131
    return-void

    .line 132
    :cond_1
    const-string p0, "Do not set reversed or empty range: "

    .line 133
    .line 134
    const-string p2, " > "

    .line 135
    .line 136
    invoke-static {p0, v4, p1, p2}, Lpc6;->m(Ljava/lang/String;IILjava/lang/String;)Ljava/lang/String;

    .line 137
    .line 138
    .line 139
    move-result-object p0

    .line 140
    invoke-static {p0}, Lbt;->q(Ljava/lang/String;)V

    .line 141
    .line 142
    .line 143
    return-void
.end method

.method public static r(Landroid/view/accessibility/AccessibilityNodeInfo;)Z
    .locals 0

    .line 1
    invoke-virtual {p0}, Landroid/view/accessibility/AccessibilityNodeInfo;->isAccessibilityDataSensitive()Z

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method

.method public static final s(Landroid/hardware/camera2/CameraExtensionCharacteristics;I)Z
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Landroid/hardware/camera2/CameraExtensionCharacteristics;->isCaptureProcessProgressAvailable(I)Z

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method

.method public static final t(Landroid/hardware/camera2/CameraExtensionCharacteristics;I)Z
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Landroid/hardware/camera2/CameraExtensionCharacteristics;->isPostviewAvailable(I)Z

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method

.method public static u(Landroid/view/accessibility/AccessibilityManager;)Z
    .locals 0

    .line 1
    invoke-virtual {p0}, Landroid/view/accessibility/AccessibilityManager;->isRequestFromAccessibilityTool()Z

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method

.method public static final v(Ljj0;)Z
    .locals 2

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    sget-object v0, Landroid/hardware/camera2/CameraCharacteristics;->CONTROL_AVAILABLE_SETTINGS_OVERRIDES:Landroid/hardware/camera2/CameraCharacteristics$Key;

    .line 5
    .line 6
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 7
    .line 8
    .line 9
    check-cast p0, Llf0;

    .line 10
    .line 11
    invoke-virtual {p0, v0}, Llf0;->c(Landroid/hardware/camera2/CameraCharacteristics$Key;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    check-cast p0, [I

    .line 16
    .line 17
    const/4 v0, 0x0

    .line 18
    if-eqz p0, :cond_0

    .line 19
    .line 20
    const/4 v1, 0x1

    .line 21
    invoke-static {p0, v1}, Leu;->a0([II)Z

    .line 22
    .line 23
    .line 24
    move-result p0

    .line 25
    if-ne p0, v1, :cond_0

    .line 26
    .line 27
    return v1

    .line 28
    :cond_0
    return v0
.end method

.method public static final w(Llw0;)Landroid/graphics/ColorSpace;
    .locals 1

    .line 1
    sget-object v0, Lnw0;->v:Lwk6;

    .line 2
    .line 3
    invoke-static {p0, v0}, Ldh3;->f(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    sget-object p0, Landroid/graphics/ColorSpace$Named;->BT2020_HLG:Landroid/graphics/ColorSpace$Named;

    .line 10
    .line 11
    invoke-static {p0}, Landroid/graphics/ColorSpace;->get(Landroid/graphics/ColorSpace$Named;)Landroid/graphics/ColorSpace;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    return-object p0

    .line 16
    :cond_0
    sget-object v0, Lnw0;->w:Lwk6;

    .line 17
    .line 18
    invoke-static {p0, v0}, Ldh3;->f(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 19
    .line 20
    .line 21
    move-result p0

    .line 22
    if-eqz p0, :cond_1

    .line 23
    .line 24
    sget-object p0, Landroid/graphics/ColorSpace$Named;->BT2020_PQ:Landroid/graphics/ColorSpace$Named;

    .line 25
    .line 26
    invoke-static {p0}, Landroid/graphics/ColorSpace;->get(Landroid/graphics/ColorSpace$Named;)Landroid/graphics/ColorSpace;

    .line 27
    .line 28
    .line 29
    move-result-object p0

    .line 30
    return-object p0

    .line 31
    :cond_1
    const/4 p0, 0x0

    .line 32
    return-object p0
.end method

.method public static final x(Landroid/hardware/camera2/CameraCaptureSession$CaptureCallback;Landroid/hardware/camera2/CameraCaptureSession;Landroid/hardware/camera2/CaptureRequest;JJ)V
    .locals 0

    .line 1
    invoke-virtual/range {p0 .. p6}, Landroid/hardware/camera2/CameraCaptureSession$CaptureCallback;->onReadoutStarted(Landroid/hardware/camera2/CameraCaptureSession;Landroid/hardware/camera2/CaptureRequest;JJ)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static y(Lkd8;JZ)V
    .locals 7

    .line 1
    if-eqz p3, :cond_7

    .line 2
    .line 3
    invoke-virtual {p0}, Lkd8;->d()Lh48;

    .line 4
    .line 5
    .line 6
    move-result-object p3

    .line 7
    sget v0, Lf88;->c:I

    .line 8
    .line 9
    const/16 v0, 0x20

    .line 10
    .line 11
    shr-long v0, p1, v0

    .line 12
    .line 13
    long-to-int v0, v0

    .line 14
    const-wide v1, 0xffffffffL

    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    and-long/2addr v1, p1

    .line 20
    long-to-int v1, v1

    .line 21
    const/16 v2, 0xa

    .line 22
    .line 23
    if-lez v0, :cond_0

    .line 24
    .line 25
    invoke-static {p3, v0}, Ljava/lang/Character;->codePointBefore(Ljava/lang/CharSequence;I)I

    .line 26
    .line 27
    .line 28
    move-result v3

    .line 29
    goto :goto_0

    .line 30
    :cond_0
    move v3, v2

    .line 31
    :goto_0
    iget-object v4, p3, Lh48;->Z:Ljava/lang/CharSequence;

    .line 32
    .line 33
    invoke-interface {v4}, Ljava/lang/CharSequence;->length()I

    .line 34
    .line 35
    .line 36
    move-result v4

    .line 37
    if-ge v1, v4, :cond_1

    .line 38
    .line 39
    invoke-static {p3, v1}, Ljava/lang/Character;->codePointAt(Ljava/lang/CharSequence;I)I

    .line 40
    .line 41
    .line 42
    move-result v2

    .line 43
    :cond_1
    invoke-static {v3}, Lg33;->H(I)Z

    .line 44
    .line 45
    .line 46
    move-result v4

    .line 47
    if-eqz v4, :cond_4

    .line 48
    .line 49
    invoke-static {v2}, Lg33;->G(I)Z

    .line 50
    .line 51
    .line 52
    move-result v4

    .line 53
    if-nez v4, :cond_2

    .line 54
    .line 55
    invoke-static {v2}, Lg33;->F(I)Z

    .line 56
    .line 57
    .line 58
    move-result v4

    .line 59
    if-eqz v4, :cond_4

    .line 60
    .line 61
    :cond_2
    invoke-static {v3}, Ljava/lang/Character;->charCount(I)I

    .line 62
    .line 63
    .line 64
    move-result p1

    .line 65
    sub-int/2addr v0, p1

    .line 66
    if-eqz v0, :cond_3

    .line 67
    .line 68
    invoke-static {p3, v0}, Ljava/lang/Character;->codePointBefore(Ljava/lang/CharSequence;I)I

    .line 69
    .line 70
    .line 71
    move-result v3

    .line 72
    invoke-static {v3}, Lg33;->H(I)Z

    .line 73
    .line 74
    .line 75
    move-result p1

    .line 76
    if-nez p1, :cond_2

    .line 77
    .line 78
    :cond_3
    invoke-static {v0, v1}, Lct7;->c(II)J

    .line 79
    .line 80
    .line 81
    move-result-wide p1

    .line 82
    goto :goto_1

    .line 83
    :cond_4
    invoke-static {v2}, Lg33;->H(I)Z

    .line 84
    .line 85
    .line 86
    move-result v4

    .line 87
    if-eqz v4, :cond_7

    .line 88
    .line 89
    invoke-static {v3}, Lg33;->G(I)Z

    .line 90
    .line 91
    .line 92
    move-result v4

    .line 93
    if-nez v4, :cond_5

    .line 94
    .line 95
    invoke-static {v3}, Lg33;->F(I)Z

    .line 96
    .line 97
    .line 98
    move-result v3

    .line 99
    if-eqz v3, :cond_7

    .line 100
    .line 101
    :cond_5
    invoke-static {v2}, Ljava/lang/Character;->charCount(I)I

    .line 102
    .line 103
    .line 104
    move-result p1

    .line 105
    add-int/2addr v1, p1

    .line 106
    iget-object p1, p3, Lh48;->Z:Ljava/lang/CharSequence;

    .line 107
    .line 108
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    .line 109
    .line 110
    .line 111
    move-result p1

    .line 112
    if-eq v1, p1, :cond_6

    .line 113
    .line 114
    invoke-static {p3, v1}, Ljava/lang/Character;->codePointAt(Ljava/lang/CharSequence;I)I

    .line 115
    .line 116
    .line 117
    move-result v2

    .line 118
    invoke-static {v2}, Lg33;->H(I)Z

    .line 119
    .line 120
    .line 121
    move-result p1

    .line 122
    if-nez p1, :cond_5

    .line 123
    .line 124
    :cond_6
    invoke-static {v0, v1}, Lct7;->c(II)J

    .line 125
    .line 126
    .line 127
    move-result-wide p1

    .line 128
    :cond_7
    :goto_1
    move-wide v2, p1

    .line 129
    const/4 v5, 0x0

    .line 130
    const/16 v6, 0x1c

    .line 131
    .line 132
    const-string v1, ""

    .line 133
    .line 134
    const/4 v4, 0x0

    .line 135
    move-object v0, p0

    .line 136
    invoke-static/range {v0 .. v6}, Lkd8;->i(Lkd8;Ljava/lang/String;JZZI)V

    .line 137
    .line 138
    .line 139
    return-void
.end method

.method public static z(Lkd8;Landroid/view/inputmethod/HandwritingGesture;Ly78;Ldn2;Lfw8;)I
    .locals 14

    .line 1
    move-object/from16 v2, p2

    .line 2
    .line 3
    move-object/from16 v3, p4

    .line 4
    .line 5
    instance-of v4, p1, Landroid/view/inputmethod/SelectGesture;

    .line 6
    .line 7
    const/4 v5, 0x0

    .line 8
    const/4 v7, 0x1

    .line 9
    if-eqz v4, :cond_2

    .line 10
    .line 11
    move-object v1, p1

    .line 12
    check-cast v1, Landroid/view/inputmethod/SelectGesture;

    .line 13
    .line 14
    invoke-virtual {v1}, Landroid/view/inputmethod/SelectGesture;->getSelectionArea()Landroid/graphics/RectF;

    .line 15
    .line 16
    .line 17
    move-result-object v3

    .line 18
    invoke-static {v3}, Lpu;->V(Landroid/graphics/RectF;)Ls86;

    .line 19
    .line 20
    .line 21
    move-result-object v3

    .line 22
    invoke-virtual {v1}, Landroid/view/inputmethod/SelectGesture;->getGranularity()I

    .line 23
    .line 24
    .line 25
    move-result v4

    .line 26
    if-eq v4, v7, :cond_0

    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_0
    move v5, v7

    .line 30
    :goto_0
    invoke-static {v2, v3, v5}, Lg33;->y(Ly78;Ls86;I)J

    .line 31
    .line 32
    .line 33
    move-result-wide v2

    .line 34
    invoke-static {v2, v3}, Lf88;->b(J)Z

    .line 35
    .line 36
    .line 37
    move-result v4

    .line 38
    if-eqz v4, :cond_1

    .line 39
    .line 40
    invoke-static {p0, v1}, Lu3;->d(Lkd8;Landroid/view/inputmethod/HandwritingGesture;)I

    .line 41
    .line 42
    .line 43
    move-result v0

    .line 44
    return v0

    .line 45
    :cond_1
    invoke-virtual {p0, v2, v3}, Lkd8;->j(J)V

    .line 46
    .line 47
    .line 48
    if-eqz p3, :cond_9

    .line 49
    .line 50
    invoke-interface/range {p3 .. p3}, Ldn2;->invoke()Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    return v7

    .line 54
    :cond_2
    instance-of v4, p1, Landroid/view/inputmethod/DeleteGesture;

    .line 55
    .line 56
    if-eqz v4, :cond_6

    .line 57
    .line 58
    move-object v1, p1

    .line 59
    check-cast v1, Landroid/view/inputmethod/DeleteGesture;

    .line 60
    .line 61
    invoke-virtual {v1}, Landroid/view/inputmethod/DeleteGesture;->getGranularity()I

    .line 62
    .line 63
    .line 64
    move-result v3

    .line 65
    if-eq v3, v7, :cond_3

    .line 66
    .line 67
    move v3, v5

    .line 68
    goto :goto_1

    .line 69
    :cond_3
    move v3, v7

    .line 70
    :goto_1
    invoke-virtual {v1}, Landroid/view/inputmethod/DeleteGesture;->getDeletionArea()Landroid/graphics/RectF;

    .line 71
    .line 72
    .line 73
    move-result-object v4

    .line 74
    invoke-static {v4}, Lpu;->V(Landroid/graphics/RectF;)Ls86;

    .line 75
    .line 76
    .line 77
    move-result-object v4

    .line 78
    invoke-static {v2, v4, v3}, Lg33;->y(Ly78;Ls86;I)J

    .line 79
    .line 80
    .line 81
    move-result-wide v8

    .line 82
    invoke-static {v8, v9}, Lf88;->b(J)Z

    .line 83
    .line 84
    .line 85
    move-result v2

    .line 86
    if-eqz v2, :cond_4

    .line 87
    .line 88
    invoke-static {p0, v1}, Lu3;->d(Lkd8;Landroid/view/inputmethod/HandwritingGesture;)I

    .line 89
    .line 90
    .line 91
    move-result v0

    .line 92
    return v0

    .line 93
    :cond_4
    if-ne v3, v7, :cond_5

    .line 94
    .line 95
    move v5, v7

    .line 96
    :cond_5
    invoke-static {p0, v8, v9, v5}, Lu3;->y(Lkd8;JZ)V

    .line 97
    .line 98
    .line 99
    return v7

    .line 100
    :cond_6
    instance-of v4, p1, Landroid/view/inputmethod/SelectRangeGesture;

    .line 101
    .line 102
    if-eqz v4, :cond_a

    .line 103
    .line 104
    move-object v1, p1

    .line 105
    check-cast v1, Landroid/view/inputmethod/SelectRangeGesture;

    .line 106
    .line 107
    invoke-virtual {v1}, Landroid/view/inputmethod/SelectRangeGesture;->getSelectionStartArea()Landroid/graphics/RectF;

    .line 108
    .line 109
    .line 110
    move-result-object v3

    .line 111
    invoke-static {v3}, Lpu;->V(Landroid/graphics/RectF;)Ls86;

    .line 112
    .line 113
    .line 114
    move-result-object v3

    .line 115
    invoke-virtual {v1}, Landroid/view/inputmethod/SelectRangeGesture;->getSelectionEndArea()Landroid/graphics/RectF;

    .line 116
    .line 117
    .line 118
    move-result-object v4

    .line 119
    invoke-static {v4}, Lpu;->V(Landroid/graphics/RectF;)Ls86;

    .line 120
    .line 121
    .line 122
    move-result-object v4

    .line 123
    invoke-virtual {v1}, Landroid/view/inputmethod/SelectRangeGesture;->getGranularity()I

    .line 124
    .line 125
    .line 126
    move-result v6

    .line 127
    if-eq v6, v7, :cond_7

    .line 128
    .line 129
    goto :goto_2

    .line 130
    :cond_7
    move v5, v7

    .line 131
    :goto_2
    invoke-static {v2, v3, v4, v5}, Lg33;->z(Ly78;Ls86;Ls86;I)J

    .line 132
    .line 133
    .line 134
    move-result-wide v2

    .line 135
    invoke-static {v2, v3}, Lf88;->b(J)Z

    .line 136
    .line 137
    .line 138
    move-result v4

    .line 139
    if-eqz v4, :cond_8

    .line 140
    .line 141
    invoke-static {p0, v1}, Lu3;->d(Lkd8;Landroid/view/inputmethod/HandwritingGesture;)I

    .line 142
    .line 143
    .line 144
    move-result v0

    .line 145
    return v0

    .line 146
    :cond_8
    invoke-virtual {p0, v2, v3}, Lkd8;->j(J)V

    .line 147
    .line 148
    .line 149
    if-eqz p3, :cond_9

    .line 150
    .line 151
    invoke-interface/range {p3 .. p3}, Ldn2;->invoke()Ljava/lang/Object;

    .line 152
    .line 153
    .line 154
    :cond_9
    return v7

    .line 155
    :cond_a
    instance-of v4, p1, Landroid/view/inputmethod/DeleteRangeGesture;

    .line 156
    .line 157
    if-eqz v4, :cond_e

    .line 158
    .line 159
    move-object v1, p1

    .line 160
    check-cast v1, Landroid/view/inputmethod/DeleteRangeGesture;

    .line 161
    .line 162
    invoke-virtual {v1}, Landroid/view/inputmethod/DeleteRangeGesture;->getGranularity()I

    .line 163
    .line 164
    .line 165
    move-result v3

    .line 166
    if-eq v3, v7, :cond_b

    .line 167
    .line 168
    move v3, v5

    .line 169
    goto :goto_3

    .line 170
    :cond_b
    move v3, v7

    .line 171
    :goto_3
    invoke-virtual {v1}, Landroid/view/inputmethod/DeleteRangeGesture;->getDeletionStartArea()Landroid/graphics/RectF;

    .line 172
    .line 173
    .line 174
    move-result-object v4

    .line 175
    invoke-static {v4}, Lpu;->V(Landroid/graphics/RectF;)Ls86;

    .line 176
    .line 177
    .line 178
    move-result-object v4

    .line 179
    invoke-virtual {v1}, Landroid/view/inputmethod/DeleteRangeGesture;->getDeletionEndArea()Landroid/graphics/RectF;

    .line 180
    .line 181
    .line 182
    move-result-object v6

    .line 183
    invoke-static {v6}, Lpu;->V(Landroid/graphics/RectF;)Ls86;

    .line 184
    .line 185
    .line 186
    move-result-object v6

    .line 187
    invoke-static {v2, v4, v6, v3}, Lg33;->z(Ly78;Ls86;Ls86;I)J

    .line 188
    .line 189
    .line 190
    move-result-wide v8

    .line 191
    invoke-static {v8, v9}, Lf88;->b(J)Z

    .line 192
    .line 193
    .line 194
    move-result v2

    .line 195
    if-eqz v2, :cond_c

    .line 196
    .line 197
    invoke-static {p0, v1}, Lu3;->d(Lkd8;Landroid/view/inputmethod/HandwritingGesture;)I

    .line 198
    .line 199
    .line 200
    move-result v0

    .line 201
    return v0

    .line 202
    :cond_c
    if-ne v3, v7, :cond_d

    .line 203
    .line 204
    move v5, v7

    .line 205
    :cond_d
    invoke-static {p0, v8, v9, v5}, Lu3;->y(Lkd8;JZ)V

    .line 206
    .line 207
    .line 208
    return v7

    .line 209
    :cond_e
    instance-of v4, p1, Landroid/view/inputmethod/JoinOrSplitGesture;

    .line 210
    .line 211
    const/4 v6, -0x1

    .line 212
    if-eqz v4, :cond_19

    .line 213
    .line 214
    move-object v1, p1

    .line 215
    check-cast v1, Landroid/view/inputmethod/JoinOrSplitGesture;

    .line 216
    .line 217
    iget-object v4, p0, Lkd8;->a:Ly68;

    .line 218
    .line 219
    invoke-virtual {v4}, Ly68;->c()Lh48;

    .line 220
    .line 221
    .line 222
    move-result-object v4

    .line 223
    iget-object v8, p0, Lkd8;->a:Ly68;

    .line 224
    .line 225
    invoke-virtual {v8}, Ly68;->c()Lh48;

    .line 226
    .line 227
    .line 228
    move-result-object v8

    .line 229
    if-eq v4, v8, :cond_f

    .line 230
    .line 231
    const/4 v0, 0x3

    .line 232
    return v0

    .line 233
    :cond_f
    invoke-virtual {v1}, Landroid/view/inputmethod/JoinOrSplitGesture;->getJoinOrSplitPoint()Landroid/graphics/PointF;

    .line 234
    .line 235
    .line 236
    move-result-object v4

    .line 237
    invoke-static {v4}, Lg33;->T(Landroid/graphics/PointF;)J

    .line 238
    .line 239
    .line 240
    move-result-wide v8

    .line 241
    invoke-static {v2, v8, v9, v3}, Lg33;->w(Ly78;JLfw8;)I

    .line 242
    .line 243
    .line 244
    move-result v3

    .line 245
    if-eq v3, v6, :cond_18

    .line 246
    .line 247
    invoke-virtual {v2}, Ly78;->c()Lx78;

    .line 248
    .line 249
    .line 250
    move-result-object v2

    .line 251
    if-eqz v2, :cond_12

    .line 252
    .line 253
    iget-object v4, v2, Lx78;->b:Lbz4;

    .line 254
    .line 255
    invoke-virtual {v4, v3}, Lbz4;->c(I)I

    .line 256
    .line 257
    .line 258
    move-result v6

    .line 259
    invoke-virtual {v2, v6}, Lx78;->h(I)I

    .line 260
    .line 261
    .line 262
    move-result v8

    .line 263
    if-eq v3, v8, :cond_11

    .line 264
    .line 265
    invoke-virtual {v4, v6, v5}, Lbz4;->b(IZ)I

    .line 266
    .line 267
    .line 268
    move-result v4

    .line 269
    if-ne v3, v4, :cond_10

    .line 270
    .line 271
    goto :goto_4

    .line 272
    :cond_10
    invoke-virtual {v2, v3}, Lx78;->a(I)Llf6;

    .line 273
    .line 274
    .line 275
    move-result-object v4

    .line 276
    add-int/lit8 v5, v3, -0x1

    .line 277
    .line 278
    invoke-virtual {v2, v5}, Lx78;->a(I)Llf6;

    .line 279
    .line 280
    .line 281
    move-result-object v2

    .line 282
    if-eq v4, v2, :cond_12

    .line 283
    .line 284
    goto :goto_8

    .line 285
    :cond_11
    :goto_4
    invoke-virtual {v2, v3}, Lx78;->i(I)Llf6;

    .line 286
    .line 287
    .line 288
    move-result-object v4

    .line 289
    invoke-virtual {v2, v3}, Lx78;->a(I)Llf6;

    .line 290
    .line 291
    .line 292
    move-result-object v2

    .line 293
    if-eq v4, v2, :cond_12

    .line 294
    .line 295
    goto :goto_8

    .line 296
    :cond_12
    invoke-virtual {p0}, Lkd8;->d()Lh48;

    .line 297
    .line 298
    .line 299
    move-result-object v1

    .line 300
    move v2, v3

    .line 301
    :goto_5
    if-lez v2, :cond_14

    .line 302
    .line 303
    invoke-static {v1, v2}, Ljava/lang/Character;->codePointBefore(Ljava/lang/CharSequence;I)I

    .line 304
    .line 305
    .line 306
    move-result v4

    .line 307
    invoke-static {v4}, Lg33;->G(I)Z

    .line 308
    .line 309
    .line 310
    move-result v5

    .line 311
    if-nez v5, :cond_13

    .line 312
    .line 313
    goto :goto_6

    .line 314
    :cond_13
    invoke-static {v4}, Ljava/lang/Character;->charCount(I)I

    .line 315
    .line 316
    .line 317
    move-result v4

    .line 318
    sub-int/2addr v2, v4

    .line 319
    goto :goto_5

    .line 320
    :cond_14
    :goto_6
    iget-object v4, v1, Lh48;->Z:Ljava/lang/CharSequence;

    .line 321
    .line 322
    invoke-interface {v4}, Ljava/lang/CharSequence;->length()I

    .line 323
    .line 324
    .line 325
    move-result v4

    .line 326
    if-ge v3, v4, :cond_16

    .line 327
    .line 328
    invoke-static {v1, v3}, Ljava/lang/Character;->codePointAt(Ljava/lang/CharSequence;I)I

    .line 329
    .line 330
    .line 331
    move-result v4

    .line 332
    invoke-static {v4}, Lg33;->G(I)Z

    .line 333
    .line 334
    .line 335
    move-result v5

    .line 336
    if-nez v5, :cond_15

    .line 337
    .line 338
    goto :goto_7

    .line 339
    :cond_15
    invoke-static {v4}, Ljava/lang/Character;->charCount(I)I

    .line 340
    .line 341
    .line 342
    move-result v4

    .line 343
    add-int/2addr v3, v4

    .line 344
    goto :goto_6

    .line 345
    :cond_16
    :goto_7
    invoke-static {v2, v3}, Lct7;->c(II)J

    .line 346
    .line 347
    .line 348
    move-result-wide v2

    .line 349
    invoke-static {v2, v3}, Lf88;->b(J)Z

    .line 350
    .line 351
    .line 352
    move-result v1

    .line 353
    if-eqz v1, :cond_17

    .line 354
    .line 355
    const/4 v5, 0x0

    .line 356
    const/16 v6, 0x1c

    .line 357
    .line 358
    const-string v1, " "

    .line 359
    .line 360
    const/4 v4, 0x0

    .line 361
    move-object v0, p0

    .line 362
    invoke-static/range {v0 .. v6}, Lkd8;->i(Lkd8;Ljava/lang/String;JZZI)V

    .line 363
    .line 364
    .line 365
    return v7

    .line 366
    :cond_17
    const/4 v5, 0x0

    .line 367
    const/16 v6, 0x1c

    .line 368
    .line 369
    const-string v1, ""

    .line 370
    .line 371
    const/4 v4, 0x0

    .line 372
    move-object v0, p0

    .line 373
    invoke-static/range {v0 .. v6}, Lkd8;->i(Lkd8;Ljava/lang/String;JZZI)V

    .line 374
    .line 375
    .line 376
    return v7

    .line 377
    :cond_18
    :goto_8
    invoke-static {p0, v1}, Lu3;->d(Lkd8;Landroid/view/inputmethod/HandwritingGesture;)I

    .line 378
    .line 379
    .line 380
    move-result v0

    .line 381
    return v0

    .line 382
    :cond_19
    instance-of v4, p1, Landroid/view/inputmethod/InsertGesture;

    .line 383
    .line 384
    if-eqz v4, :cond_1b

    .line 385
    .line 386
    move-object v1, p1

    .line 387
    check-cast v1, Landroid/view/inputmethod/InsertGesture;

    .line 388
    .line 389
    invoke-virtual {v1}, Landroid/view/inputmethod/InsertGesture;->getInsertionPoint()Landroid/graphics/PointF;

    .line 390
    .line 391
    .line 392
    move-result-object v4

    .line 393
    invoke-static {v4}, Lg33;->T(Landroid/graphics/PointF;)J

    .line 394
    .line 395
    .line 396
    move-result-wide v4

    .line 397
    invoke-static {v2, v4, v5, v3}, Lg33;->w(Ly78;JLfw8;)I

    .line 398
    .line 399
    .line 400
    move-result v2

    .line 401
    if-ne v2, v6, :cond_1a

    .line 402
    .line 403
    invoke-static {p0, v1}, Lu3;->d(Lkd8;Landroid/view/inputmethod/HandwritingGesture;)I

    .line 404
    .line 405
    .line 406
    move-result v0

    .line 407
    return v0

    .line 408
    :cond_1a
    invoke-virtual {v1}, Landroid/view/inputmethod/InsertGesture;->getTextToInsert()Ljava/lang/String;

    .line 409
    .line 410
    .line 411
    move-result-object v1

    .line 412
    invoke-static {v2, v2}, Lct7;->c(II)J

    .line 413
    .line 414
    .line 415
    move-result-wide v2

    .line 416
    const/4 v5, 0x0

    .line 417
    const/16 v6, 0x1c

    .line 418
    .line 419
    const/4 v4, 0x0

    .line 420
    move-object v0, p0

    .line 421
    invoke-static/range {v0 .. v6}, Lkd8;->i(Lkd8;Ljava/lang/String;JZZI)V

    .line 422
    .line 423
    .line 424
    return v7

    .line 425
    :cond_1b
    instance-of v4, p1, Landroid/view/inputmethod/RemoveSpaceGesture;

    .line 426
    .line 427
    if-eqz v4, :cond_24

    .line 428
    .line 429
    move-object v1, p1

    .line 430
    check-cast v1, Landroid/view/inputmethod/RemoveSpaceGesture;

    .line 431
    .line 432
    invoke-virtual {v2}, Ly78;->c()Lx78;

    .line 433
    .line 434
    .line 435
    move-result-object v4

    .line 436
    invoke-virtual {v1}, Landroid/view/inputmethod/RemoveSpaceGesture;->getStartPoint()Landroid/graphics/PointF;

    .line 437
    .line 438
    .line 439
    move-result-object v8

    .line 440
    invoke-static {v8}, Lg33;->T(Landroid/graphics/PointF;)J

    .line 441
    .line 442
    .line 443
    move-result-wide v8

    .line 444
    invoke-virtual {v1}, Landroid/view/inputmethod/RemoveSpaceGesture;->getEndPoint()Landroid/graphics/PointF;

    .line 445
    .line 446
    .line 447
    move-result-object v10

    .line 448
    invoke-static {v10}, Lg33;->T(Landroid/graphics/PointF;)J

    .line 449
    .line 450
    .line 451
    move-result-wide v10

    .line 452
    invoke-virtual {v2}, Ly78;->e()Ly24;

    .line 453
    .line 454
    .line 455
    move-result-object v2

    .line 456
    const/16 v12, 0x20

    .line 457
    .line 458
    if-eqz v4, :cond_20

    .line 459
    .line 460
    iget-object v4, v4, Lx78;->b:Lbz4;

    .line 461
    .line 462
    if-nez v2, :cond_1c

    .line 463
    .line 464
    goto :goto_a

    .line 465
    :cond_1c
    invoke-interface {v2, v8, v9}, Ly24;->E(J)J

    .line 466
    .line 467
    .line 468
    move-result-wide v8

    .line 469
    invoke-interface {v2, v10, v11}, Ly24;->E(J)J

    .line 470
    .line 471
    .line 472
    move-result-wide v10

    .line 473
    invoke-static {v4, v8, v9, v3}, Lg33;->v(Lbz4;JLfw8;)I

    .line 474
    .line 475
    .line 476
    move-result v2

    .line 477
    invoke-static {v4, v10, v11, v3}, Lg33;->v(Lbz4;JLfw8;)I

    .line 478
    .line 479
    .line 480
    move-result v3

    .line 481
    if-ne v2, v6, :cond_1d

    .line 482
    .line 483
    if-ne v3, v6, :cond_1f

    .line 484
    .line 485
    sget-wide v2, Lf88;->b:J

    .line 486
    .line 487
    goto :goto_b

    .line 488
    :cond_1d
    if-ne v3, v6, :cond_1e

    .line 489
    .line 490
    goto :goto_9

    .line 491
    :cond_1e
    invoke-static {v2, v3}, Ljava/lang/Math;->min(II)I

    .line 492
    .line 493
    .line 494
    move-result v2

    .line 495
    :goto_9
    move v3, v2

    .line 496
    :cond_1f
    invoke-virtual {v4, v3}, Lbz4;->e(I)F

    .line 497
    .line 498
    .line 499
    move-result v2

    .line 500
    invoke-virtual {v4, v3}, Lbz4;->a(I)F

    .line 501
    .line 502
    .line 503
    move-result v3

    .line 504
    add-float/2addr v3, v2

    .line 505
    const/high16 v2, 0x40000000    # 2.0f

    .line 506
    .line 507
    div-float/2addr v3, v2

    .line 508
    new-instance v2, Ls86;

    .line 509
    .line 510
    shr-long/2addr v8, v12

    .line 511
    long-to-int v8, v8

    .line 512
    invoke-static {v8}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 513
    .line 514
    .line 515
    move-result v9

    .line 516
    shr-long/2addr v10, v12

    .line 517
    long-to-int v10, v10

    .line 518
    invoke-static {v10}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 519
    .line 520
    .line 521
    move-result v11

    .line 522
    invoke-static {v9, v11}, Ljava/lang/Math;->min(FF)F

    .line 523
    .line 524
    .line 525
    move-result v9

    .line 526
    const v11, 0x3dcccccd    # 0.1f

    .line 527
    .line 528
    .line 529
    sub-float v13, v3, v11

    .line 530
    .line 531
    invoke-static {v8}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 532
    .line 533
    .line 534
    move-result v8

    .line 535
    invoke-static {v10}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 536
    .line 537
    .line 538
    move-result v10

    .line 539
    invoke-static {v8, v10}, Ljava/lang/Math;->max(FF)F

    .line 540
    .line 541
    .line 542
    move-result v8

    .line 543
    add-float/2addr v3, v11

    .line 544
    invoke-direct {v2, v9, v13, v8, v3}, Ls86;-><init>(FFFF)V

    .line 545
    .line 546
    .line 547
    sget-object v3, Lqe4;->y0:Lem7;

    .line 548
    .line 549
    invoke-virtual {v4, v2, v5, v3}, Lbz4;->g(Ls86;ILem7;)J

    .line 550
    .line 551
    .line 552
    move-result-wide v2

    .line 553
    goto :goto_b

    .line 554
    :cond_20
    :goto_a
    sget-wide v2, Lf88;->b:J

    .line 555
    .line 556
    :goto_b
    invoke-static {v2, v3}, Lf88;->b(J)Z

    .line 557
    .line 558
    .line 559
    move-result v4

    .line 560
    if-eqz v4, :cond_21

    .line 561
    .line 562
    invoke-static {p0, v1}, Lu3;->d(Lkd8;Landroid/view/inputmethod/HandwritingGesture;)I

    .line 563
    .line 564
    .line 565
    move-result v0

    .line 566
    return v0

    .line 567
    :cond_21
    new-instance v4, Lca6;

    .line 568
    .line 569
    invoke-direct {v4}, Ljava/lang/Object;-><init>()V

    .line 570
    .line 571
    .line 572
    iput v6, v4, Lca6;->X:I

    .line 573
    .line 574
    new-instance v5, Lca6;

    .line 575
    .line 576
    invoke-direct {v5}, Ljava/lang/Object;-><init>()V

    .line 577
    .line 578
    .line 579
    iput v6, v5, Lca6;->X:I

    .line 580
    .line 581
    invoke-virtual {p0}, Lkd8;->d()Lh48;

    .line 582
    .line 583
    .line 584
    move-result-object v8

    .line 585
    invoke-static {v2, v3}, Lf88;->d(J)I

    .line 586
    .line 587
    .line 588
    move-result v9

    .line 589
    invoke-static {v2, v3}, Lf88;->c(J)I

    .line 590
    .line 591
    .line 592
    move-result v10

    .line 593
    iget-object v8, v8, Lh48;->Z:Ljava/lang/CharSequence;

    .line 594
    .line 595
    invoke-interface {v8, v9, v10}, Ljava/lang/CharSequence;->subSequence(II)Ljava/lang/CharSequence;

    .line 596
    .line 597
    .line 598
    move-result-object v8

    .line 599
    invoke-virtual {v8}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 600
    .line 601
    .line 602
    move-result-object v8

    .line 603
    new-instance v9, Lkc6;

    .line 604
    .line 605
    const-string v10, "\\s+"

    .line 606
    .line 607
    invoke-direct {v9, v10}, Lkc6;-><init>(Ljava/lang/String;)V

    .line 608
    .line 609
    .line 610
    new-instance v10, Lp0;

    .line 611
    .line 612
    const/16 v11, 0x1b

    .line 613
    .line 614
    invoke-direct {v10, v4, v5, v11}, Lp0;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 615
    .line 616
    .line 617
    invoke-virtual {v9, v8, v10}, Lkc6;->e(Ljava/lang/String;Lgn2;)Ljava/lang/String;

    .line 618
    .line 619
    .line 620
    move-result-object v8

    .line 621
    iget v9, v4, Lca6;->X:I

    .line 622
    .line 623
    if-eq v9, v6, :cond_23

    .line 624
    .line 625
    iget v10, v5, Lca6;->X:I

    .line 626
    .line 627
    if-ne v10, v6, :cond_22

    .line 628
    .line 629
    goto :goto_c

    .line 630
    :cond_22
    shr-long v11, v2, v12

    .line 631
    .line 632
    long-to-int v1, v11

    .line 633
    add-int/2addr v9, v1

    .line 634
    add-int/2addr v1, v10

    .line 635
    invoke-static {v9, v1}, Lct7;->c(II)J

    .line 636
    .line 637
    .line 638
    move-result-wide v9

    .line 639
    iget v1, v4, Lca6;->X:I

    .line 640
    .line 641
    invoke-virtual {v8}, Ljava/lang/String;->length()I

    .line 642
    .line 643
    .line 644
    move-result v4

    .line 645
    invoke-static {v2, v3}, Lf88;->c(J)I

    .line 646
    .line 647
    .line 648
    move-result v6

    .line 649
    invoke-static {v2, v3}, Lf88;->d(J)I

    .line 650
    .line 651
    .line 652
    move-result v2

    .line 653
    sub-int/2addr v6, v2

    .line 654
    iget v2, v5, Lca6;->X:I

    .line 655
    .line 656
    sub-int/2addr v6, v2

    .line 657
    sub-int/2addr v4, v6

    .line 658
    invoke-virtual {v8, v1, v4}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 659
    .line 660
    .line 661
    move-result-object v1

    .line 662
    const/4 v5, 0x0

    .line 663
    const/16 v6, 0x1c

    .line 664
    .line 665
    const/4 v4, 0x0

    .line 666
    move-object v0, p0

    .line 667
    move-wide v2, v9

    .line 668
    invoke-static/range {v0 .. v6}, Lkd8;->i(Lkd8;Ljava/lang/String;JZZI)V

    .line 669
    .line 670
    .line 671
    return v7

    .line 672
    :cond_23
    :goto_c
    invoke-static {p0, v1}, Lu3;->d(Lkd8;Landroid/view/inputmethod/HandwritingGesture;)I

    .line 673
    .line 674
    .line 675
    move-result v0

    .line 676
    return v0

    .line 677
    :cond_24
    const/4 v0, 0x2

    .line 678
    return v0
.end method
